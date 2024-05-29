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
public class dbconnect {
    private static String user = "root";
    private static String password = "1234";
    private static String road = "jdbc:mysql://localhost:3306/mysql";
    
    public dbconnect(){
    }
    
    public static Connection connect(){
        Connection con;
        try{
            con = DriverManager.getConnection(road,user,password);
            return(con);
        }catch (Exception e){
            System.out.println("bin in der catch von dbconnect");
        }
        return null;
    }
}
