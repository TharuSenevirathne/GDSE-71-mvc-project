/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.dto.Dto;
import edu.ijse.mvc.db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author tharu
 */
public class model {
    
    public String save(Dto dto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
                
        statement.setString (1,dto.getId());
        statement.setString(2,dto.getTitle());
        statement.setString(3,dto.getName());
        statement.setString(4,dto.getDob());
        statement.setDouble(5,dto.getSalary());
        statement.setString(6,dto.getAddress());
        statement.setString(7,dto.getCity());
        statement.setString(8,dto.getProvince());
        statement.setString(9,dto.getPostalcode());
        
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully saved" : "Unsuccessfuly";
        
    }
    
    
    public String update(Dto dto) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customer SET title = ?,name=?,Dob=?,Salary=?,Address=?,City=?,Province=?,Postalcode=";
        PreparedStatement statement = connection.prepareStatement(sql);
                
        statement.setString(2,dto.getTitle());
        statement.setString(3,dto.getName());
        statement.setString(4,dto.getDob());
        statement.setDouble(5,dto.getSalary());
        statement.setString(6,dto.getAddress());
        statement.setString(7,dto.getCity());
        statement.setString(8,dto.getProvince());
        statement.setString(9,dto.getPostalcode());
        statement.setString (1,dto.getId());
        
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Updated" :"Failed";
        
    }
    
     public String Delete (String id)throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE from Customer where id = ? ";                                                   
        PreparedStatement statement = connection.prepareStatement(sql);
                
        statement.setString (1,id);
        
        
        int result = statement.executeUpdate();
        return result > 0 ? "Successfully Deleted" : "Failed";
        
    }
    
    
}  
