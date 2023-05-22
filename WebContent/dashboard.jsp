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
	
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("uname") == null){
			response.sendRedirect("loginn.jsp");
		}
	%>
	
	Welcome, Bhai ${uname} br/>
	
	All of the recommended videos are here <a href="videos.jsp"> Click here</a>
	
	
	<form aciton="Logo">
		<input type="submit" value="logout">
	</form>
</body>
</html>