package com.amit.dao;

import java.io.PrintWriter;
import java.sql.*;




public class LoginDao {
	
	String query = "select * from login where uname=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/jdbc";
	public boolean check(String uname, String pass)
	{
		try {
  			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,"root","");
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, uname);
			statement.setString(2, pass);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) return true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
