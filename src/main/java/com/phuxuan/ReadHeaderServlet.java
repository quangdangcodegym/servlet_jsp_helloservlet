package com.phuxuan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ReadHeaderServlet" , urlPatterns = "/readheaderservlet")
public class ReadHeaderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");  
	    PrintWriter out = resp.getWriter();  
	        
	    out.println("HTTP headers sent by your client:<br>");  
	    
	    Enumeration headerNames = req.getHeaderNames();
	    out.println("<HTML><BODY><TABLE>");
	    while(headerNames.hasMoreElements()) {
	      String headerName = (String)headerNames.nextElement();
	      out.println("<TR><TD>" + headerName);
	      out.println("    <TD>" + req.getHeader(headerName));
	    }
	    out.println("</TABLE>\n</BODY></HTML>");
	}
	

}
