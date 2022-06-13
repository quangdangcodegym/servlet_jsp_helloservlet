package com.phuxuan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(displayName = "MyFilter", urlPatterns = "/myfilter-adminservlet/*")
public class MyFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter out=resp.getWriter();  
        
	    String password=req.getParameter("password");  
	    if(password.equals("admin")){  
	    	chain.doFilter(req, resp);//sends request to next resource  
	    }  
	    else{  
		    out.print("user or password error!\n");  
		    RequestDispatcher rd=req.getRequestDispatcher("/filter_index.jsp");  
		    rd.include(req, resp);  
	    }  
		
	}

	@Override
	public void destroy() {
		System.out.println("MyFilter destroy...........");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("MyFilter init...........");
	}

}
