package com.phuxuan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MySessionServlet", urlPatterns = "/mysessionservlet")
public class MySessionServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		System.out.println("getRequestedSessionId" + req.getRequestedSessionId());
		System.out.println("getSession.getId()" + req.getSession().getId());
		
		
		String user = "";
		
		
		if(req.getParameter("u")!=null) {
			String u = req.getParameter("u");
			req.getSession().setAttribute("user", u);
		}
		if(req.getSession().getAttribute("user")!=null) {
			user = (String) req.getSession().getAttribute("user");
		}
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("User info: " + user);
		
		
		
		
		/*
		 * Runnable runnable = new Runnable() {
		 * 
		 * @Override public void run() { try { Thread.sleep(5000); } catch
		 * (InterruptedException e) { e.printStackTrace(); }
		 * System.out.println(req.getSession().getId());
		 * 
		 * } };
		 * 
		 * new Thread(runnable).start();
		 */
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	@Override
	public void init() throws ServletException {
		super.init();
	}
	
	

}
