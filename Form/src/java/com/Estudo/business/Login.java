/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Estudo.business;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
    		HttpServletResponse response) throws 
    		  ServletException, IOException {
 
    	response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
 
    	//get parameters from request object.
    	String userName = request.getParameter("userName").trim();
    	String password = request.getParameter("password").trim();
 
    	//check for null and empty values.
    	if(userName == null || userName.equals("") || password == null || password.equals("")){
    		out.print("Please enter both username and password. <br/><br/>");
    		
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
    		
                requestDispatcher.include(request, response);
    	}//Check for valid username and password.
    	else if(userName.equals("jai") && password.equals("1234")){
    		
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Welcome");
            requestDispatcher.forward(request, response);
    	}else{
    		out.print("Wrong username or password. <br/><br/>");
    		RequestDispatcher requestDispatcher = 
    			request.getRequestDispatcher("/index.html");
    		requestDispatcher.include(request, response);
    	}
	}
    }
    

    

