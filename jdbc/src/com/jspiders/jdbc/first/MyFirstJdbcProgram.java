package com.jspiders.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJdbcProgram {

	public static void main(String[] args) {
		
		Connection CON = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Driver DRIVERREF= new Driver();
			DriverManager.registerDriver(DRIVERREF);
			
		String dburl = "jdbc:mysql://localhost:3306/jspiders?user=root&password=root";
			CON = DriverManager.getConnection(dburl);
			
			
		String query =   " select * from studentsinfo ";
		
		 stmt = CON.createStatement();
		 rs = stmt.executeQuery(query);
		while(rs.next())
		{
			int regNum = rs.getInt("regno");
			String fName = rs.getString("firstname");
			String mName = rs.getString("middlename");
			String lname = rs.getString("lastname");
			
			System.out.println("Regno : "+regNum);
			System.out.println("Firstname : "+fName);
			System.out.println("Middlename : "+mName);
			System.out.println("Lastname : "+lname);
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally
		{
			try {
					if(CON!=null)
					{
						CON.close();
					} 
					if(stmt!=null) {
						stmt.close();
					}
					if(rs!=null) {
						rs.close();
					}
			}catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		
	}
