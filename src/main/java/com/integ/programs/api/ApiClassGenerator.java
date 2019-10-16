package com.integ.programs.api;

import com.google.common.base.CaseFormat;

import com.integ.CommonUtils;
import com.integ.LibraryClasses;
import com.squareup.javapoet.*;
import org.joda.time.LocalDateTime;

import javax.inject.Inject;
import javax.lang.model.element.Modifier;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ApiClassGenerator {

    public static void generate(String databaseTableName , File path) throws IOException {

        String defClassName =  CommonUtils.getClassNameFromTableName(databaseTableName);

        ClassName ThrowableUtil = ClassName.get("com.integ.restful.dart.common.util","ThrowableUtil");
        ClassName RestfulResponseclass = LibraryClasses.getCommonRestfulResponse();
        ClassName DataSource = LibraryClasses.getDBUtilGenericDataSource();
        ClassName DataAccess = LibraryClasses.getDBUtilDataAccess();

        ClassName defclass = ClassName.get(CommonUtils.getDirAndPackage(path)[1] + "immutables",defClassName);
        ClassName DAO = ClassName.get(CommonUtils.getDirAndPackage(path)[1] + "dao",defClassName+"DAO");
        TypeName deftype = ParameterizedTypeName.get(ClassName.get(List.class),defclass);

//        List<ParameterSpec> spec = new ArrayList<>();
//        spec.add(ParameterSpec.builder(TypeName.get(String.class),"iso")
//                .addAnnotation(AnnotationSpec.builder(QueryParam.class).addMember("value","$S","iso").build()).build());
//        spec.add(ParameterSpec.builder(TypeName.get(String.class),"sandbox")
//                .addAnnotation(AnnotationSpec.builder(QueryParam.class).addMember("value","$S","sandbox").build()).build());


        MethodSpec insert = MethodSpec.methodBuilder("insert"+defClassName)
                .addModifiers(Modifier.PUBLIC)
                .returns(RestfulResponseclass)
                .addAnnotation(CommonUtils.getAnnotationSpec(POST.class))
                .addAnnotation(CommonUtils.getAnnotationSpec(Produces.class, MediaType.APPLICATION_JSON))
                .addAnnotation(CommonUtils.getAnnotationSpec(Consumes.class, MediaType.APPLICATION_JSON))
                .addParameter(deftype, "list")
                .addStatement("$T.tryThrow(() -> $T.runDa(ds, $T.$L(list,$L.getUserPrincipal().getName())))", ThrowableUtil,DataAccess, DAO,"insert"+defClassName,"context")
//                    .addStatement("$T tt = new $T($S,$S,$L,$L)",Employee.class,Employee.class,"yash","ce",30000,3)
                .addStatement("return $T.$L",RestfulResponseclass,"SUCCESS")
//                    .addParameters(spec)
                .build();
        MethodSpec delMethod = MethodSpec.methodBuilder("delete"+defClassName)
                .addModifiers(Modifier.PUBLIC)
                .returns(RestfulResponseclass)
                .addAnnotation(CommonUtils.getAnnotationSpec(Path.class,"del"))
                .addAnnotation(CommonUtils.getAnnotationSpec(POST.class))
                .addAnnotation(CommonUtils.getAnnotationSpec(Produces.class, MediaType.APPLICATION_JSON))
                .addAnnotation(CommonUtils.getAnnotationSpec(Consumes.class, MediaType.APPLICATION_JSON))
                .addParameter(deftype, "list")
                .addStatement("$T.tryThrow(() -> $T.runDa(ds, $T.$L(list)))", ThrowableUtil,DataAccess, DAO,"delete"+defClassName)
//                    .addStatement("$T tt = new $T($S,$S,$L,$L)",Employee.class,Employee.class,"yash","ce",30000,3)
                .addStatement("return $T.$L",RestfulResponseclass,"SUCCESS")
                .build();
        MethodSpec get = MethodSpec.methodBuilder("get"+defClassName)
                .addException(Exception.class)
                .addModifiers(Modifier.PUBLIC)
                .returns(deftype)
                .addAnnotation(CommonUtils.getAnnotationSpec(POST.class))
                .addAnnotation(CommonUtils.getAnnotationSpec(Produces.class, MediaType.APPLICATION_JSON))
//                    .addStatement("$T.out.println($S)", System.class, "Hello, JavaPoet!")
//                    .addStatement("return $T.$L", Arrays.class, "stream(new int[]{1,2})")
                .addStatement("return $T.tryThrow(() -> $T.runDa(ds, $T.$L()))", ThrowableUtil,DataAccess, DAO,"get"+defClassName)
                .build();
        FieldSpec dataSource = FieldSpec.builder(DataSource,"ds")
                .addAnnotation(CommonUtils.getAnnotationSpec(Inject.class)).build();
        FieldSpec context = FieldSpec.builder(SecurityContext.class,"context")
                .addAnnotation(CommonUtils.getAnnotationSpec(Context.class)).build();



        TypeSpec apiClass = TypeSpec.classBuilder(defClassName+"Api")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addMethod(get)
                .addMethod(insert)
                .addMethod(delMethod)
                .addAnnotation(AnnotationSpec.builder(Path.class).addMember("value","$S","/test").build())
                .addField(dataSource)
                .addField(context)
                .build();

        CommonUtils.writeProgramToFile(path,apiClass,"api");

    }

    private static  String removeLast(String str) {
        if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

}
