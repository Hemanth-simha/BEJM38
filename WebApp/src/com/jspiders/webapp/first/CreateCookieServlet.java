package com.jspiders.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookieServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Cookie ck1 = new Cookie("MyName","Hemanth");
		Cookie ck2= new Cookie("MyLocation","Mandya");
		ck2.setMaxAge(7*24*60*60);//Persistence Cookie
		//ck2.setMaxAge(-7*24*60*60);NonPersistence Cookie
		//ck2.setMaxAge(0);Delete Cookie
		
		resp.addCookie(ck1);
		resp.addCookie(ck2);
		
		PrintWriter out = resp.getWriter();
		out.println("Cookies are generated....");
	}
	
}
