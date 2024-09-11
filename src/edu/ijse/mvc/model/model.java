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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


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
     
     public Dto search (String id) throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * from WHERE id = ? ";                      
        PreparedStatement statement = connection.prepareStatement(sql);
                
        statement.setString (1,id);
        
        ResultSet rst = statement.executeQuery();
        
        if(rst.next()){
        Dto dto = new Dto(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9));
        return dto;
        
        }
        
        return null;
        
    }   
    
     
     public List< Dto > getAll () throws Exception{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * Customer ";                 
        PreparedStatement statement = connection.prepareStatement(sql);
                
       List < Dto > Dtos = new ArrayList<>();
        
        ResultSet rst = statement.executeQuery();
        
        while(rst.next()){
        Dto dto = new Dto(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getDouble(5),rst.getString(6),rst.getString(7),rst.getString(8),rst.getString(9));
        Dtos.add(dto);
        }
        
        return Dtos;
        
    }   
}  
