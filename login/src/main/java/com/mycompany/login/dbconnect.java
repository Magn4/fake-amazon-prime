/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login;
import java.sql.*;

/**
 *
 * @author jrwie
 */

 /**
  * Updated connection to database with Dynamic methods
  * @author Taha
  */
public class dbconnect {
    private static String user = System.getenv("DB_USER");
    private static String password = System.getenv("DB_PASSWORD");
    private static String road = "jdbc:mysql://" + System.getenv("DB_HOST") + ":" + System.getenv("DB_PORT") + "/" + System.getenv("DB_NAME");
    
    public dbconnect(){
    }
    
    public static Connection connect(){
        Connection con;
        try{
            con = DriverManager.getConnection(road, user, password);
            return con;
        }catch (Exception e){
            System.out.println("bin in der catch von dbconnect");
            e.printStackTrace();
        }
        return null;
    }

    public static String getUser(){
        return user;
    }
    public static String getPassword(){
        return password;
    }
    public static String getRoad(){
        return road;
    }
}
