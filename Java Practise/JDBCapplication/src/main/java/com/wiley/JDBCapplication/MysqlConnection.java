package com.wiley.JDBCapplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
	static Connection conn;
	public static Connection createConnection() {
		
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";//com.mysql.cj.jdbc.Driver
			String url = "jdbc:mysql://localhost:3306";
			String user = "root";
			String pass = "Anmolsahu@123";
			
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
