package com.jspiders.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyRequestServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String method = req.getMethod();
		String protocol = req.getProtocol();
		StringBuffer URL = req.getRequestURL();
		
		PrintWriter out = resp.getWriter();
		out.println("HTTP Method : "+method);
		out.println("Protocol : "+protocol);
		out.println("URL : "+URL);
	}
	
}
