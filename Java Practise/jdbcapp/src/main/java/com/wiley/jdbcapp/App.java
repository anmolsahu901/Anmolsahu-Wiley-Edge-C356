package com.wiley.jdbcapp;
import java.sql.*;
import java.util.Scanner;
/**
 * 1. import java.sql.*;
 * 2. load and register the driver --> com.mysql.jdbc.Driver
 * 3. Create connection ---> connection
 * 4. create a statement ---> statement
 * 5. execute the query 
 * 6. process the the result
 * 7. close 
 */
public class App 
{
	static Connection conn;
	public static void main( String[] args )
	{
		
		System.out.println("Ho");
		Connection conn = DBConnection.createDBConnection();
		
		EmployeeDaoImple emp = new EmployeeDaoImple();
		emp.getEmpById(1);

		
//		try {
//			DBConnection dbcon = new DBConnection();
//			Connection conn = dbcon.createDBConnection();
//			
//			
//			/* JDBC Transactions*/
//			
//			//disable the autocomit
//			conn.setAutoCommit(false);
//			
//			//here is your trasaction
//			
//			
//		} catch (Exception e) {
//		conn.rollback();
//		
//		}
		
	}
}


//DELIMITER $$
//CREATE PROCEDURE GetCustomers(val) 
//BEGIN
//   SELECT * FROM employee where name LIKE 
//END $$
//DELIMITER;















