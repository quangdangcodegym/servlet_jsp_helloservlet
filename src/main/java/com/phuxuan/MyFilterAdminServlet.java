package com.phuxuan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MyFilterAdminServlet", urlPatterns = "/myfilter-adminservlet")
public class MyFilterAdminServlet extends HttpServlet {  
	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        out.print("welcome ADMIN");  
	        out.close();  
	    }  
	}  