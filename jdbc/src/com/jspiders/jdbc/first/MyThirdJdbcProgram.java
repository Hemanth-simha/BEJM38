package com.jspiders.jdbc.first;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class MyThirdJdbcProgram {

	public static void main(String[] args) throws IOException {
		
			File file = new File("C:\\jspiders\\J2ee Software\\Softwares\\MyFolder\\MyProp.properties");
			FileReader reader = new FileReader(file);
			Properties prop = new Properties();
			prop.load(reader);
			
			Connection CON = null;
			PreparedStatement pstmt = null;
		try {
			Driver driverref= new Driver();
			DriverManager.registerDriver(driverref);
			
			String dburl= prop.getProperty("dburl");
			CON = DriverManager.getConnection(dburl,prop);
			
			String query = " delete from studentsinfo "
					+ " where regno = ? ";
			pstmt = CON.prepareStatement(query);
			pstmt.setInt(1,Integer.parseInt(args[0]));
			int res = pstmt.executeUpdate();
			
			if(res!=0)
			{
				System.out.println("Record successfully deleted.....");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(CON!=null)
				{
					CON.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
			
		}
		
		
		
	}

}
