package com.phuxuan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.phuxuan.model.UserInfo;

@WebServlet(name = "JavaBean", urlPatterns = "/javabean")
public class JavaBean extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action ="";
		if(req.getParameter("action")!=null) {
			action = req.getParameter("action");
		}
		UserInfo userInfo = new UserInfo("Quang codegym", "lao", 1);
		req.setAttribute("mybean", userInfo);
		

		System.out.println(serialVersionUID);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/javabean.jsp");
		requestDispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	public void init() throws ServletException {
		super.init();
		
	}

	
	
}
