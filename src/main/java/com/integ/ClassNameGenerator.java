package com.integ;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ClassNameGenerator {


    public static void main(String[] args) throws Exception{
        List<String> classNames = new ArrayList<String>();
        ZipInputStream zip = new ZipInputStream(new FileInputStream("D:\\maven\\com\\integ\\core\\common\\2.1.0\\common-2.1.0.jar"));
        for (ZipEntry entry = zip.getNextEntry(); entry != null; entry = zip.getNextEntry()) {
            if (!entry.isDirectory() && entry.getName().endsWith(".class")) {
                // This ZipEntry represents a class. Now, what class does it represent?
                String className = entry.getName().replace('/', '.'); // including ".class"
                classNames.add(className.substring(0, className.length() - ".class".length()));
            }
        }



        classNames.forEach( n -> {
            String className,packageName;
            int i = n.lastIndexOf('.');
            className = n.substring(i+1);
            packageName = n.substring(0,i);

            System.out.println( "public static ClassName getCommon"+className
                    +"(){\nreturn ClassName.get(\""+packageName + "\",\""
                    +className+"\");\n}");
        });



    }

}
