package com.jspiders.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet implements SingleThreadModel{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Date date = new Date();
		PrintWriter out = resp.getWriter();
		
		String htmlres = "<html>"
				+ "<head>"
				+ "<title>"
				+ "Current Date and Time"
				+ "</title>"
				+ "</head>"
				+ "<body text=\"blue\">"
				+ date
				+ "</body>"
				+ "</html>";
		out.println(htmlres);
		resp.setContentType("text/html");
	}
}
