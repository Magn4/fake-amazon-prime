package com.mycompany.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnect {
    private static final String USER = "root";
    private static final String PASSWORD = "password123";
    private static final String HOST = "localhost";
    private static final String PORT = "3308";
    private static final String DATABASE = "userlogin";
    private static final String ROAD = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

    public dbconnect() {}

    public static Connection connect() {
        Connection con;
        try {
            con = DriverManager.getConnection(ROAD, USER, PASSWORD);
            return con;
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
        return null;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static String getRoad() {
        return ROAD;
    }
}
