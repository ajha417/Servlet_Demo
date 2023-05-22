package com.amit.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet
{
	
	/*
	 * public void service(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException { int i = Integer.parseInt(req.getParameter("num1")); int j =
	 * Integer.parseInt(req.getParameter("num2")); int k = i + j;
	 * 
	 * PrintWriter writer = res.getWriter(); writer.println("result is:"+k);
	 * System.out.println("result is:"+k); }
	 */
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		 int i = Integer.parseInt(request.getParameter("num1")); 
		 int j = Integer.parseInt(request.getParameter("num2")); 
		 int k = i + j;
		 
//		 we can use HttpSession to pass data to another servlet
		 
		 
//		 HttpSession session = request.getSession();
//		 session.setAttribute("k", k);
		 
//		 request.setAttribute("key", k);
//		 RequestDispatcher rDispatcher = request.getRequestDispatcher("square");
//		 rDispatcher.forward(request, response);
		 
//		 response.sendRedirect("square?k="+k); //this is called url rewriting
		 
		 
//		 we have another technique for session management
		 Cookie cookie = new Cookie("k", k+"");
		 response.addCookie(cookie);
		 
		 response.sendRedirect("square");
	}
	
	

}
