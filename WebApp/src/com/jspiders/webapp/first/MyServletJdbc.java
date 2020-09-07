package com.jspiders.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class MyServletJdbc extends HttpServlet {

	Connection CON = null;
	Statement stmt = null;
	ResultSet rs = null;

	@Override
	public void init() throws ServletException {
		try {
			Driver DRIVERREF = new Driver();
			DriverManager.registerDriver(DRIVERREF);

			String dburl = "jdbc:mysql://localhost:3306/jspiders?user=root&password=root";
			CON = DriverManager.getConnection(dburl);

			String query = " select * from studentsinfo ";

			stmt = CON.createStatement();
			rs = stmt.executeQuery(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			while (rs.next())
			{
				int regNum = rs.getInt("regno");
				String fName = rs.getString("firstname");
				String mName = rs.getString("middlename");
				String lname = rs.getString("lastname");

				out.println("Regno : " + regNum);
				out.println("Firstname : " + fName);
				out.println("Middlename : " + mName);
				out.println("Lastname : " + lname);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		try {
			if (CON != null) {
				CON.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}