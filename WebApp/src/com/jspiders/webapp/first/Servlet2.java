package com.jspiders.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Object obj = null;
		HttpSession session = req.getSession();
		obj = session.getAttribute("Sample");
		Sample sample = (Sample)obj;
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		if (obj != null) {
			out.println("Name : "+sample.name);
			out.println("Value : "+sample.value);
		} else {
			out.println("Invalid Request");
		}
	
	}
	
	
}
