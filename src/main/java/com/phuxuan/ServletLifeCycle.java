package com.phuxuan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletLifeCycle" , urlPatterns = "/servletlifecircle")
public class ServletLifeCycle extends HttpServlet{

	public ServletLifeCycle() {
		System.out.println("This is default constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println("I am from doget method");
		printWriter.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	public void init() throws ServletException {
		System.out.println("I am from init method");
	}

	@Override
	public void destroy() {
		System.out.println("I am from destroy method");
	}
	
	
	
}
