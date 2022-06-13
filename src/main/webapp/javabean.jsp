<%@page import="com.phuxuan.model.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.phuxuan.model.UserInfo" %>
<%@ page import="java.util.Date" %>
<%@ page errorPage="/error_page.jsp" %>
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
         
				UserInfo userInfo = new UserInfo("Quang", "Viet Nam", 1);
         
			%>  
         Today is: <%= new Date() %> 
         <%-- 
         Khong them trung them userInfo duoc
         <jsp:useBean id="userInfo" class="com.phuxuan.model.UserInfo" > --%>
         
         <jsp:useBean id="userInfo1" class="com.phuxuan.model.UserInfo" scope="page">
         		<jsp:setProperty name = "userInfo1" property = "userName"  value = "Quang Phu Xuan"/>
       	</jsp:useBean>
       	
       	<h1>Hello Phu Xuan</h1>
       		<jsp:getProperty name = "userInfo1" property = "userName"/>
       		
       	<h1>Hello Codegym</h1>
       		<jsp:useBean id="mybean" class="com.phuxuan.model.UserInfo" scope="request"></jsp:useBean>
       		<jsp:getProperty name = "mybean" property = "userName"/>
       		
       		<%-- 
       		
       		Thieu dong nay khong duoc: <jsp:useBean id="mybean" class="com.phuxuan.model.UserInfo" scope="request"></jsp:useBean>
       		<jsp:getProperty name = "mybean" property = "userName"/> --%>
      </center>
   </body>
</html>