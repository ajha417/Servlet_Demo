<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
		String name = request.getParameter("name");
		out.println("Welome," + name);
		pageContext.setAttribute("user", name,PageContext.SESSION_SCOPE);
	%>
		<a href="second_pageC.jsp">Second page</a>
</body>
</html>