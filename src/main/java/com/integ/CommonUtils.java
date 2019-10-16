package com.integ;

import com.google.common.base.CaseFormat;
import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

import java.io.File;
import java.io.IOException;

public class CommonUtils {

    private static  String removeLast(String str) {
        if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String[] getDirAndPackage(File path){

        String  fullPath = path.getPath();

        String [] sp = fullPath.split("\\\\");

        String packageName = "";
        String dir = "";
        boolean flag = true;
        for(String a : sp){

            if(flag){
                dir = dir + a +"\\";
            }else{
                packageName = packageName +  a+".";
            }

            if(a.equals("java")){
                flag = false;
            }
        }

        if(dir.length() > 0 )
            dir = removeLast(dir);


        if(packageName.length() > 0)
            packageName = removeLast(packageName);

        return new String[]{dir,packageName};
    }

    public static void writeProgramToFile(File path, TypeSpec typeSpec,String type) throws IOException {
        String [] temp = CommonUtils.getDirAndPackage(path);

        String directory = temp[0];
        String packageName =  temp[1] + type;

        JavaFile file = JavaFile.builder(packageName,typeSpec).build();

        file.writeTo(new File(directory));
    }

    public static String getClassNameFromTableName(String tableName){
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL,tableName);
    }

    public static AnnotationSpec getAnnotationSpec(Class name){
        return getAnnotationSpec(name,"");
    }
    public static AnnotationSpec getAnnotationSpec(Class name,String value){
        if(value.equals(""))
            return AnnotationSpec.builder(name).build();
        return AnnotationSpec.builder(name).addMember("value", "$S", value).build();
    }

}
