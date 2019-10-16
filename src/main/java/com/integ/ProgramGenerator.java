package com.integ;

import com.integ.database.connection.DatabaseConnection;
import com.integ.exception.FileException;
import com.integ.programs.api.DefClassGenerator;
import com.integ.programs.api.RestAPIGenerator;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class ProgramGenerator {

    public static void main(String[] args) throws  Exception{

        String path = "src/main/java/com/integ/test";
        String databaseTableName = "UNIT";

        generateDefClass(new DatabaseConnection("localhost","XE","PMGR","PMGR",49191),
                databaseTableName,path);
//        generateApi(databaseTableName,path,"UNITID","EFFECTIVEDATE");

    }

    public static void generateApi(DatabaseConnection connection, String databaseTableName, String path, String ... primaryKeyValues) throws Exception {
        File directory = null;
        try {
            directory = createFile(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(directory != null){
            List<String> primaryKeys = Arrays.asList(primaryKeyValues);
            RestAPIGenerator.generate(connection,databaseTableName,directory,primaryKeys);
        }

    }

    public static void generateDefClass(DatabaseConnection connection,String databaseTableName,String path) throws Exception {
        File directory = null;
        try {
            directory = createFile(path);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(directory != null){
            DefClassGenerator.generateClassFor(connection,databaseTableName,directory);
        }

    }


    private static File createFile(String path) throws FileException  {
        File file = new File(path);

        if(!file.exists()){
            throw new FileException("Please create directory for generate files - " +path);
        }
        return file;
    }
}
