package com.wiley.BankLoanApplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class dBConnection {
	static Connection conn;
	public static Connection createConnection() {
		try {
	    	String driver = "com.mysql.cj.jdbc.Driver";
	    	String url = "jdbc:mysql://localhost:3306/bankloanapplication";
	    	String username = "root";
	    	String password = "Anmolsahu@123";
	    	
	    	Class.forName(driver);
	    	
	    	conn = DriverManager.getConnection(url,username,password);
	    	
	    	System.out.println("Database connected");
	    }
	     catch(Exception e) {
	    	e.printStackTrace();
	    }
		
		return conn;	
	}
}
