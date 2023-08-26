/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.server.dao;

import com.app.server.db.DbConnection;
import com.app.server.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UserDao {
    
    private final Connection connection;
    
    
    public UserDao() throws SQLException{
    
        connection =DbConnection.getConnection();
    }
    
    public void createUseer(User user) throws SQLException{
    
        String sql ="INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
        
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setString(1,user.getName());
            
            statement.setString(2,user.getEmail());
            
            statement.setString(3, user.getPassword());
            
            statement.executeUpdate();
        
        }
    
    }
    
    
    public List<User> searchUserByIDAndAttributes(int id, String name, String email, String password) throws SQLException{
        
       List<User> users = new ArrayList<>();
        
        String sql = "SELECT * FROM users WHERE id = ? AND name = ? AND email = ? AND password = ?";
         
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setString(1,name);
             
            try(ResultSet resultSet = statement.executeQuery()){
             
                while(resultSet.next()){
                     
                    User user = new User();
                     
                    user.setId(resultSet.getInt("id"));
                     
                    user.setName(resultSet.getString("name"));
                     
                    user.setEmail(resultSet.getString("email"));
                     
                    user.setPassword(resultSet.getString("password"));
                     
                    users.add(user);
                 
                 
                 }
             }
         }
        
        return users;
    
    }
    
    
    public void updateUser(User updatedUser)throws SQLException{
        
        String sql = "UPDATE users SET name = ?, email = ?, password = ? WHERE id = ?";
        
        try(PreparedStatement statement = connection.prepareStatement(sql)){
        
            statement.setString(1,updatedUser.getName());
            
            statement.setString(2, updatedUser.getEmail());
            
            statement.setString(3, updatedUser.getPassword());

            statement.setInt(4,updatedUser.getId());
            
            statement.executeUpdate();
        }
        
    }
    
    public void deleteUser(int id)throws SQLException{
        
        String sql = "DELETE FROM users WHERE id = ?";
        
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            
            statement.setInt(1,id);
            
            statement.executeUpdate();
        
        }
        
    } 
    
}
