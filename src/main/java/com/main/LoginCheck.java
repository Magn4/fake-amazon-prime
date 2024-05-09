/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;
import java.sql.*;

/**
 *
 * @author jrwie
 */
public class LoginCheck {
    
    private String user;
    private String password;
    
    
    public LoginCheck(String u,String p){
        setUser(u);
        setPassword(p);
    }
    
    private void setUser(String u){
        this.user = u;
    }
    private void setPassword(String p){
        this.password = p;
    }
    private String getUser(){
        return(this.user);
    }
    private String getPassword(){
        return(this.password);
    }
    /*
    public static void main(String[] args){
        //System.out.println("ich war in der class");
        LoginCheck test = new LoginCheck("Admin","1234");
        test.userCompare();
    }
    */
  /*
    public boolean userCompare(){
        Connection con;
        try{
            
            //con = connection
            con = DriverManager.getConnection("jdbc:mysql://192.168.2.115:3306/mysql","test","password123");
            //stm = Statement
            Statement stm = con.createStatement();
            //sql 
            
            String sql = "SELECT * FROM userlogin.user_table WHERE BINARY UserName='"+this.getUser()+"' and BINARY Password='"+this.getPassword()+"';";
            
            //rs = resultSet
            ResultSet rs = stm.executeQuery(sql);
            
            if(rs.next()){
                System.out.println("true");
                return(true);
            }else{
                System.out.println("false");
                return(false);
            }
            
        }catch (Exception e){
            System.out.println(e);
            System.out.println("ich war in dem chatch");
        }
        return(false);
    }
    */
    
    public boolean userCompare() {
    Connection con = null;
    try {
        // Establish connection
        con = DriverManager.getConnection("jdbc:mysql://192.168.2.115:3306/mysql", "test", "password123");

        // Check if connection is successful
        if (con != null && !con.isClosed()) {
            System.out.println("Connected to MySQL server.");
        } else {
            System.out.println("Failed to connect to MySQL server.");
            return false; // Return false if connection failed
        }

        Statement stm = con.createStatement();
        
        // SQL to select user
        // String sql = "SELECT * FROM fake-amazon-prime.user_table WHERE BINARY UserName='" + this.getUser() + "' AND BINARY Password='" + this.getPassword() + "'";
        // SQL to select user
        
        String sql = "SELECT * FROM `fake-amazon-prime`.`fake-amazon-prime` WHERE BINARY UserName='" + this.getUser() + "' AND BINARY Password='" + this.getPassword() + "'";

        ResultSet rs = stm.executeQuery(sql);
        
        if (rs.next()) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
        
    } catch (SQLException sqle) {
        System.out.println("SQL Error: " + sqle.getMessage());
    } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    } finally {
        // Close resources
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error closing connection: " + ex.getMessage());
            }
        }
    }
    return false;
}

      /*
    public boolean userCompare() {
    Connection con = null;
    try {
        // Establish connection
        con = DriverManager.getConnection("jdbc:mysql://192.168.2.115:3306/mysql", "test", "password123");
        Statement stm = con.createStatement();
        
        // SQL to create user_table if not exists
        String createTableSQL = "CREATE TABLE IF NOT EXISTS userlogin.user_table ("
            + "UserID INT NOT NULL AUTO_INCREMENT,"
            + "UserName VARCHAR(45) NOT NULL,"
            + "Password VARCHAR(45) NOT NULL,"
            + "UserEmail VARCHAR(45) NOT NULL,"
            + "PRIMARY KEY (UserID),"
            + "UNIQUE INDEX UserID_UNIQUE (UserID ASC) VISIBLE,"
            + "UNIQUE INDEX UserName_UNIQUE (UserName ASC) VISIBLE,"
            + "UNIQUE INDEX UserEmail_UNIQUE (UserEmail ASC) VISIBLE"
            + ")";
        
        stm.executeUpdate(createTableSQL); // Execute the CREATE TABLE statement
        
        // SQL to select user
        String sql = "SELECT * FROM userlogin.user_table WHERE BINARY UserName='" + this.getUser() + "' AND BINARY Password='" + this.getPassword() + "'";
        
        ResultSet rs = stm.executeQuery(sql);
        
        if (rs.next()) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
        
    } catch (Exception e) {
        System.out.println(e);
        System.out.println("An error occurred.");
    } finally {
        // Close resources
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Error closing connection.");
            }
        }
    }
    return false;
}
*/
    //war eine funktion die dazu da war die ganze tabelle aus zu geben
    private static void testverbindung(){
        Connection con;
        //System.out.println("ich war in der methode");
        try{
            //Class.forName("com.mysql.cj.jdbc.driver");
            //System.out.println("ich war in der try");
            
            //con = connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","asd123");
            
            //System.out.println(con);
            
            //stm = Statement
            Statement stm = con.createStatement();
            
            
            String sql = "SELECT * FROM userlogin.user_table;";
            
            //rs = resultSet
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                System.out.println(rs.getInt("UserID")+" "+rs.getString("UserName")+" "+rs.getString("Password"));
            }
            
        }catch (Exception e){
            System.out.println(e);
            System.out.println("ich war in der chatch");
        }
    }
}
