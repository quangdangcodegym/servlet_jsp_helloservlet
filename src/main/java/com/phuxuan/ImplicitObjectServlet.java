package com.phuxuan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ImplicitObjectServlet" , urlPatterns = "/implicitobjectservlet")
public class ImplicitObjectServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String user = (String) req.getParameter("user");
		req.setAttribute("user1", user);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/implicitobject.jsp");
		
		requestDispatcher.forward(req, resp);
	}
	
	

}
