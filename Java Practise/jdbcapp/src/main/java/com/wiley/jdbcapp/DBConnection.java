package com.wiley.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	static Connection conn;
	
	public static Connection createDBConnection() {
		try {
String driver = "com.mysql.cj.jdbc.Driver";
			
			//connection string
			String url = "jdbc:mysql://localhost:3306/wileyjdbc";
			String username = "root";
			String password = "Anmolsahu@123";
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
					
			System.out.println("Connection Success");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	
}
