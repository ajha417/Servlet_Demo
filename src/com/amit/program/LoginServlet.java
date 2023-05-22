package com.amit.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.amit.dao.LoginDao;


@WebServlet("/Login")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String pass = req.getParameter("pass");
		LoginDao dao = new LoginDao();
		PrintWriter out = resp.getWriter();
		if(dao.check(name, pass)) {
			HttpSession session = req.getSession();
			session.setAttribute("uname", name);
			resp.sendRedirect("dashboard.jsp");
			
		}
		else {
			resp.sendRedirect("loginn.jsp");
		}
	}

}
