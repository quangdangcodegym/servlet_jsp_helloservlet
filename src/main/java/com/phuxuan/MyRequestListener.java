package com.phuxuan;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener(value = "MyRequestListener")
public class MyRequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		ServletRequest request = sre.getServletRequest();
		System.out.println("Request has been served and ended");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		ServletRequest request = sre.getServletRequest();
		System.out.println("A new request has arrived");
		System.out.println("Accessing request parameters using ServletRequest object");
		System.out.println("Welcome "+ request.getParameter("username"));
		System.out.println("How is weather in " + request.getParameter("cityname") + "?");
		System.out.println("Request Locale : " + request.getLocale());
		System.out.println("Request Protocol : " + request.getProtocol());
		System.out.println("Request ContentType : " + request.getContentType());
		System.out.println("Request Local IP : " + request.getLocalAddr());
		System.out.println("Request Server Name : " + request.getServerName());
	}

	
}
