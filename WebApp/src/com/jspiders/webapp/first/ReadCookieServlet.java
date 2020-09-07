package com.jspiders.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadCookieServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[]ck = req.getCookies();
		PrintWriter out = resp.getWriter();
		out.println("Number of Cookies found : "+ck.length);
		
		for (int i = 0; i < ck.length; i++) {
			out.println("Cookie Name : "+ck[i].getName());
			out.println("Cookie Value : "+ck[i].getValue());
		}
		
	}
	
}
