/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.server.models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dell
 */
public class User {
    
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    private String password;
    
    
    public boolean isStrongPAssword(){
    
        return password.length() < 8;
    }
    
    public boolean isValidEmail(){
    
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+\\.com\\.br)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    
}
