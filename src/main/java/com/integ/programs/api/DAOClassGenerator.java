package com.integ.programs.api;

import com.integ.CommonUtils;
import com.integ.LibraryClasses;
import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class DAOClassGenerator {

    public static void generate(String databaseTableName , File path , List<String> pkeys) throws IOException {

        String priString = "";
        for( String s: pkeys){
            priString += ",\""+s+"\"";
        }
        priString = priString.replaceFirst(",","");

        String defClassName =  CommonUtils.getClassNameFromTableName(databaseTableName);

        ClassName defclass = ClassName.get(CommonUtils.getDirAndPackage(path)[1] + "immutables",defClassName);

        ClassName DAOperation = LibraryClasses.getDBUtilDAOperation();
        ClassName SQLBuilder = LibraryClasses.getDBUtilSQLBuilder();
        ClassName ModificationSupport = LibraryClasses.getDBUtilModificationSupport();
        ClassName ImmutableDataMapper = LibraryClasses.getDBUtilImmutableDataMapper();
        ClassName ImmutableExtractor = LibraryClasses.getDBUtilImmutableExtractors();

        TypeName deftype = ParameterizedTypeName.get(DAOperation, ParameterizedTypeName.get(ClassName.get(List.class),defclass));
        TypeName temp =  ArrayTypeName.of(int.class);
        TypeName daoInt = ParameterizedTypeName.get(DAOperation, temp);
        TypeName listDef = ParameterizedTypeName.get(ClassName.get(List.class),defclass);
        MethodSpec insert = MethodSpec.methodBuilder("insert"+defClassName)
                .addException(Exception.class)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addParameter(listDef, "list")
                .addParameter(String.class,"user")
                .returns(daoInt)
                .addStatement("return da -> da.$L(\n$T.$L($S,$T.class,new $T{$L}).build()\n," +
                                "$T.$L($T.$L(list, user)))","execute",
                        SQLBuilder,"upsert",defclass.simpleName(),defclass,ArrayTypeName.of(String.class),priString
                        ,ImmutableDataMapper,"toParamVals",ModificationSupport,"withModInfo"
                )
                .build();
        MethodSpec delMethod = MethodSpec.methodBuilder("delete"+defClassName)
                .addException(Exception.class)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addParameter(listDef, "list")
                .returns(daoInt)
                .addStatement("return da -> da.$L(\n$T.$L($S,$T.class,new $T{$L}).build()\n," +
                                "$T.$L(list))","execute",
                        SQLBuilder,"delete",defclass.simpleName(),defclass,ArrayTypeName.of(String.class),priString
                        ,ImmutableDataMapper,"toParamVals"
                )
                .build();
        MethodSpec get = MethodSpec.methodBuilder("get"+defClassName)
                .addException(Exception.class)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(deftype)
                .addStatement("return da -> da.$L($S\n,$T.$L($T.class))","get","select * " +
                        "from "+databaseTableName+" ",ImmutableExtractor,"rowExtractorOf",defclass)
                .build();


        TypeSpec daoClass = TypeSpec.classBuilder(defClassName+"DAO")
                .addModifiers(Modifier.PUBLIC)
                .addMethod(get)
                .addMethod(insert)
                .addMethod(delMethod)
                .build();



        CommonUtils.writeProgramToFile(path,daoClass,"dao");
    }
}
