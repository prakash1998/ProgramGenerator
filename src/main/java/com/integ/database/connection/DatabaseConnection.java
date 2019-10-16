package com.integ.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private String hostName;
    private String sid;
    private String userName;
    private String password;
    private int port;

    public DatabaseConnection(String hostName, String sid, String userName, String password, int port) {
        this.hostName = hostName;
        this.sid = sid;
        this.userName = userName;
        this.password = password;
        this.port = port;
    }

    public Connection getOracleConnection()
            throws ClassNotFoundException, SQLException {
        // Declare the class Driver for Oracle DB
        // This is necessary with Java 5 (or older)
        // Java6 (or newer) automatically find the appropriate driver.
        // If you use Java> 6, then this line is not needed.
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // Example: jdbc:oracle:thin:@localhost:1521:db11g
        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":"+port+":" + sid;

        System.out.println(connectionURL);

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);

        System.out.println(conn);
        return conn;
    }
}
