package com.integ.programs.api;

import com.integ.database.connection.DatabaseConnection;

import java.io.File;
import java.util.List;

public class RestAPIGenerator {

    public static void generate(DatabaseConnection connection, String databaseTableName, File path , List<String> primaryKeys) throws  Exception{


        DefClassGenerator.generateClassFor(connection,databaseTableName,path) ;
        ApiClassGenerator.generate(databaseTableName,path);
        DAOClassGenerator.generate(databaseTableName,path,primaryKeys);
    }


}
