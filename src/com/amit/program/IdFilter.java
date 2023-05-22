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
import javax.servlet.http.HttpServletRequest;


@WebFilter(filterName = "addPerson", urlPatterns = { "/addPerson" }, servletNames = { "addIt" })
public class IdFilter implements Filter {

    
	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter outPrintWriter = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		int uid = Integer.parseInt(request.getParameter("uid"));
		if(uid > 1) {
			
			chain.doFilter(request, response);
		}
		else {
			outPrintWriter.print("Invalid input");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
