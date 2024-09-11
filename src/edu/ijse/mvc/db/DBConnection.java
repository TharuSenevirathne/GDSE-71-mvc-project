/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author tharu
 */
public class DBConnection {
    private static DBConnection dbconnection;
    
    private Connection connection;
    
    private DBConnection() throws SQLException,ClassNotFoundException{
        
        Class.forName("com.mysql.cj.jdbo.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","root","mysql");
    }
    
    public static DBConnection getInstance() throws SQLException,ClassNotFoundException{
        
        if(dbconnection == null){
        dbconnection = new DBConnection();
        }
        return dbconnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
   
}
