package com.amit.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletContext_Config extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out = resp.getWriter();
		out.print("Hi, ");
		
//		this is servletContext
		/*
		 * ServletContext ctx = getServletContext(); // tomcat will automatically get
		 * object of servletContext while running the program String str =
		 * ctx.getInitParameter("name"); out.print(str);
		 */
		
//		this is servletConfig
//		servletconfig is created for every servlet and we can unique configuration for each servlet
		
		ServletConfig cng = getServletConfig();
		String str = cng.getInitParameter("name");
		out.print(str);
	}

}
