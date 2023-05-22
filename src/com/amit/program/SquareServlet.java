package com.amit.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		int k = 0;
//		when the data is passed in url
//		int k = Integer.parseInt(req.getParameter("k"));
		
//		HttpSession session = req.getSession();
//		int k = (int) session.getAttribute("k");
		
		
//		to fetch cookies
		Cookie cookies[] = req.getCookies();
		for(Cookie c:cookies) {
			if(c.getName().equals("k"))
				k = Integer.parseInt(c.getValue());
		}
		k = k * k;
		PrintWriter writer = res.getWriter();
		writer.println("The square is: "+k);
	}
}
