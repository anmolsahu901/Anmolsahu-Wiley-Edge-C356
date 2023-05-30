package com.wiley.JDBCapp;

import java.sql.*;


public class App 
{
	    public static void main( String[] args ) throws SQLException 
	    {
	//// BASIC 1:

	    	 String url = "jdbc:mysql://localhost:3306/wileyjdbc";
	    	 String username = "root";
	    	 String password = "Anmolsahu@123";
	    	 
	    	 System.out.println("Loading driver...");
	
	    	 try {
	    		 //register driver 
	    	     Class.forName("com.mysql.cj.jdbc.Driver");
	    	     System.out.println("Driver loaded!");
	    	 } catch (ClassNotFoundException e) {
	    	     throw new IllegalStateException("Cannot find the driver in the classpath!", e);
	    	 }
	
	    	 System.out.println("Connecting database...");
	
	    	 Connection conn = DriverManager.getConnection(url, username, password);
	    	 System.out.println("Database connected!");
	    	
	    	 // query to fetch data from database 
	    	 String query = "SELECT * FROM Candidates where first_name LIKE 'a%'" ;
	    	 
	    	 Statement st = conn.createStatement();
//	    	 int count  = st.executeUpdate(query); // in case of statement we can pass query in this
	    	 // function not in case of PreparedStatement
	    	 ResultSet rs = st.executeQuery(query);
	    	 
	    	 System.out.println("Output of query is : ");
	    	 
	    	 while(rs.next()) {
	    		 System.out.println(rs.getInt("id")+" "+   // add column name or column number both will work
	    	 rs.getString(2)+" "+rs.getString(3));
	    	 }
	    	 
	    	 st.close();

	    	 
	    	 //BASIC 2 :  query to add data into database
	    	String query2 = "Insert into candidates values(?,?,'Sahu','2001-01-08','8305774824','anmol@gmail.com')";
	//    	Statement st2 = conn.createStatement();
	    	PreparedStatement st2 = conn.prepareStatement(query2);
	    	st2.setInt(1, 911);
	    	st2.setString(2, "Aanshi");
	    	int count = st2.executeUpdate();
	    	
	    	System.out.println(count);
	    	
	    	
	    	
	   	 conn.close();

	    }

	// BASIC 3 : DAO data access object 
//	public static void main( String[] args ) throws SQLException{
//		EmployeeDAO dao = new EmployeeDAO();
//		Employee c = dao.getEmployee(1);
//		System.out.println(c.name);
//
//	}


}
class EmployeeDAO{
	Connection conn = null;
	EmployeeDAO(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2 
			String url = "jdbc:mysql://localhost:3306/wileyjdbc";
			String username = "root";
			String password = "Anmolsahu@123";
			conn = DriverManager.getConnection(url, username, password);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public Employee getEmployee(int id) {
		Employee emp = new Employee();
		emp.id = id;
		try {
			//step1 
			
			//step3
			String query = "Select * from employee where id = ?";
			PreparedStatement st = conn.prepareStatement(query);
			 st.setInt(1, 1);
			ResultSet rs = st.executeQuery();
			
			rs.next();
			emp.name = rs.getString(2);
			emp.salary = rs.getDouble(3);
			emp.age = rs.getInt(4);
					
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return emp;
	}
}

class Employee{
	int id;
	String name;
	double salary;
	int age;
}











































//    	try {
//			String driver = "com.mysql.cj.jdbc.Driver";
//			
//			//connection string
//			String url = "jdbc:mysql//localhost:3306/mysqljdbc";
//			String username = "root";
//			String password = "password";
//			
//			Class.forName(driver);
//			
//			Connection conn = DriverManager.getConnection(url, username, password);
//			
//			String query = "SELECT * FROM employees";
//			
//			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery(query);
//			
//			rs.next();
//			String name = rs.getString("firstName");
//			
//			
//			System.out.println("Connection success");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}