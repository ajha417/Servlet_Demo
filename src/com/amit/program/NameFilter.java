package com.amit.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class NameFilter
 */
@WebFilter(urlPatterns = { "/addPerson" }, servletNames = { "addIt" })
public class NameFilter implements Filter {

    
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		if(name.length() >= 3) {
			
			chain.doFilter(request, response);
		}
		else {
			out.print("Invalid name... It must have atleast 3 characters.");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
