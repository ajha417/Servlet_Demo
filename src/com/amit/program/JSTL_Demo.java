package com.amit.program;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jstlDemo")
public class JSTL_Demo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = "Amit Kumar Jha";
		req.setAttribute("name", name);
		
		List<Student> students = Arrays.asList(new Student(3, "Aarti"), new Student(4, "Suphiya"), new Student(5, "Prachi"));
		req.setAttribute("students", students);
		Student s = new Student(1, "Amit Jha");
		req.setAttribute("student", s);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
 	}

}
