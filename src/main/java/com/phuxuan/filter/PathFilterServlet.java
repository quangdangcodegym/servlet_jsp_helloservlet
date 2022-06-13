package com.phuxuan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "pathFilter")
public class PathFilterServlet implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		System.out.println("Servlet Servlet Path: " + httpServletRequest.getServletPath());
		System.out.println("Servlet Path Info : " + httpServletRequest.getPathInfo());
		System.out.println("Servlet Path Uri: " + httpServletRequest.getRequestURI());
		
	
		
	}

}
