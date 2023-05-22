<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%! ResultSet rset = null; %>
	<%
	
		//load the driver
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String uname = "root";
			String password = "";
			String query = "SELECT * FROM users WBERE id = 1";
			Connection conn = DriverManager.getConnection(url,uname,password);
			Statement st = conn.createStatement();
			ResultSet rset = st.executeQuery(query);
			rset.next();
		
		}
	catch(Exception ex){
		out.println(ex.getMessage());
	}
	%>
	
	Name: <%= rset.getString(1) %> <br/>
	Address: <%= rset.getString(1) %> <br/>
</body>
</html>