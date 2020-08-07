package com.jspiders.jdbc.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class InsertStudentsDetials {

	public static void main(String[] args) {

		Connection CON = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		try {
			Driver driverref = new Driver();
			DriverManager.registerDriver(driverref);

			String dburl = "jdbc:mysql://localhost:3306/jspiders?user=root&password=root";
			CON = DriverManager.getConnection(dburl);

			String query1 = " insert into branch " +
			                " values(?,?) ";

			String query2 = " insert into book " +
			              " values(?,?,?) ";

			String query3 = " insert into student " + 
			              " values(?,?,?,?) ";

			pstmt1 = CON.prepareStatement(query1);
			pstmt1.setInt(1,Integer.parseInt(args[0]));
			pstmt1.setString(2,args[1]);
			
			pstmt2 = CON.prepareStatement(query2);
			pstmt2.setInt(1,Integer.parseInt(args[2]));
			pstmt2.setString(2,args[3]);
			pstmt2.setInt(3,Integer.parseInt(args[4]));
			
			pstmt3 = CON.prepareStatement(query3);
			pstmt3.setInt(1,Integer.parseInt(args[5]));
			pstmt3.setString(2,args[6]);
			pstmt3.setInt(3,Integer.parseInt(args[7]));
			pstmt3.setInt(4,Integer.parseInt(args[8]));
			
			int res1 = pstmt1.executeUpdate();
			int res2 = pstmt2.executeUpdate();
			int res3 = pstmt3.executeUpdate();
			
			if(res1!=0 && res2!=0 && res3!=0)
			{
				System.out.println("Record inserted successfully");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(CON!=null) {
					CON.close();
				}if(pstmt1!=null) {
					pstmt1.close();
				}
				if(pstmt2!=null) {
					pstmt2.close();
				}
				if(pstmt3!=null) {
					pstmt3.close();
				}
				
				
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

	}

}
