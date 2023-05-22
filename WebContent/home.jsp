
this is directive
<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@ include file="header.jsp" %>
	<h1>Hello world from JSP page</h1>
	
	this is declaration
	<%!
		int coef = 8;
		
	%>
	
	this is scriptlet
	<%
		out.print(12+56);
	%>
	
	this is expression
	<%= coef %>
</body>
</html>
		