<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>

<%!
	int counter;
	public void jspInit(){
		counter = 0;
		System.out.println("The lifecycle jsp has been initalized");
	}
%>

<html>
	<head>JSP Life Cycle</head>
	<% System.out.println("The lifecycle jsp has received request");
		counter++;
	
	%>
	<h2>JSP life cycle: Request counter</h2>
	<p>This page has been called <%= counter %></p>
	<body>
	
	</body>
</html>
<%!
	public void jspDestroy(){
	System.out.println("The lifecycle jsp has been destroy");
	}

%>