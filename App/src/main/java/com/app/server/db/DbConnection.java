/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.server.db;

/**
 *
 * @author Dell
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class DbConnection {
    
    private static final String URL =  "jdbc:mysql://localhost:3306/myDb"; // tem que criar o BANCO DE DADOS
    
    private static final String USERNAME = "root";
    
    private static final String PASSWORD = "test";
    
    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(URL,USERNAME, PASSWORD);
    
    }
    
}