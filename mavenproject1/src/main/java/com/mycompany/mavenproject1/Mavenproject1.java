/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Mavenproject1 {

    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/myDb";
        String username = "root";
        String password = "test";
        try{
                Connection conn =DriverManager.getConnection(dbUrl,username,password);
                
                
                if(conn != null){
                    System.out.println("Connection");
                  
                }
                Select(conn, "John");
                System.out.println();
                
//                Insert(conn,"Pedro");
                
        
        }catch(SQLException ex){
        }
        
    }
    private static void Insert(Connection conn,String name) throws SQLException{
        String sql = "INSERT INTO Person (name)VALUES (?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,name);
        
        int rowsInserted = statement.executeUpdate();
        
        if(rowsInserted>0){
            System.out.println("Sucess!");
        }
        }
    
    
    
    
    
    
    
     private static void Select( Connection conn, String name) throws SQLException{
     
        String sql = "SELECT name FROM Person WHERE name = ?";

        PreparedStatement statement = conn.prepareStatement(sql);

        statement.setString(1, name);
        ResultSet result =statement.executeQuery();
        while (result.next()) {
//            int id = result.getInt("id");
            String nameBD  = result.getString("name");

//            String email = result.getString("email");

            System.out.println("RESULTADO!!! "+nameBD);
        }
     }
}

