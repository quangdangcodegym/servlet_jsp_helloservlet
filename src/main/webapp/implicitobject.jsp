<%@page import="com.phuxuan.model.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Java Bean In Servlet 3.0</title>
   </head>
   <body>
      <center>
         <h2>Java Bean In Servlet 3.0</h2>
         <%-- <%= 100/0%> --%>
         <%  
         		// Lay implicit object o code java
				System.out.println(request.getRequestURI());
         		System.out.println(request.getParameter("user"));
			%>  
			<!-- Lay theo kieu jstl -->
			<h1>Thông tin theo codejava</h1>
			${request.getParameter("user") }
			<h1>----------------------</h1>
			<h1>Thông tin theo jstl</h1>
			${user1 }
			${requestScope.user1 }
         
      </center>
   </body>
</html>