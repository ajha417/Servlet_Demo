<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="ControllerServlet" method="post">
		<label>Name:</label>
		<input type="text" name="name"><br/>
		<label>Password:</label>
		<input type="password" name="password"> <br/>
		<input type="submit" value="login">
	</form>

</body>
</html>