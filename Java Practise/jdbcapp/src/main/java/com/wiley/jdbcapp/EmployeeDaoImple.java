package com.wiley.jdbcapp;

import java.sql.*;
import java.util.Scanner;

public class EmployeeDaoImple implements EmployeeDao {

	Connection conn=null;
	
	EmployeeDaoImple(){
		conn = DBConnection.createDBConnection();
		
		Scanner obj = new Scanner(System.in);
		
		
		
		
		do {
			System.out.println("Wiley Employee management system");
			System.out.println("Enter 1 for add employee"
					+ "\nEnter 2 for show all employee"
					+"\n3 for show employee based on id"
					+"\n4 for update employe detail"
					+"\n5 for delete employee"
					+"\n6 for sort employees on basis of salary enter A for Ascending and D for Descending"
					+ "\n7 for search the employee on basis of name"
					+ "\n0 to exit");
			System.out.println("Enter your Option : ");
			int n = obj.nextInt();
			if(n==0) break;
			switch(n){
			case 1: {
				System.out.println("Enter id:");
				int id = obj.nextInt();
				System.out.println("Enter name:");
				String name = obj.nextLine();
				obj.next();
				
				
				System.out.println("Enter salary: ");
				double salary = obj.nextDouble();
				System.out.println("Enter age ");
				int age = obj.nextInt();
				Employee emp = new Employee(id,"Mansi",salary,age);
				createEmployee(emp);
				break;
			}
			case 2:
			{
				getAllEmployee();break;
			}
			case 3:
			{
				System.out.println("Enter id:");
				int id = obj.nextInt();
				getEmpById(id);
				break;
			}
			case 4:{
				System.out.println("Enter id:");
				int id = obj.nextInt();
				System.out.println("Enter name:");
				obj.next();
				String name = obj.nextLine();
				updateEmpNameById(id,name);
				break;
			}
			case 5:{
				System.out.println("Enter id:");
				int id = obj.nextInt();
				deleteEmpById(id);break;
			}
			case 6:
			{
				System.out.println("Enter A for ascending and D for descending :");
				String s = obj.next();
				sortBySalary(s);
			}
			case 7:{
				System.out.println("Enter name:");
				obj.next();
				String name = obj.nextLine();
				Search(name);
			}
			default: break;
			}
			
		}while(true);
	}

	public void createEmployee(Employee emp) {
//		1
		String query = "INSERT INTO employee values (?,? ,? ,? )";

		try {
			PreparedStatement ps = conn.prepareStatement(query) ;
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			ps.setInt(4, emp.getAge());

			int count = ps.executeUpdate();
			if(count!=0)
				System.out.println("Employee inserted SuccessFully");



		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void getAllEmployee() {
		conn = DBConnection.createDBConnection();

		String query = "SELECT * FROM employee";
		System.out.println("----------------------------------------------------");
		System.out.format("%s\t%s\t%s\\t%s\\t","ID","NAME","SALARY","AGE");
		System.out.println("----------------------------------------------------");

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4));
				System.out.println("-----------------------------------------");

			}
		} catch (Exception e) {
			e.printStackTrace();		}


	}

	public void getEmpById(int id) {
		conn = DBConnection.createDBConnection();

		String query = "SELECT * FROM employee where id = "+id;

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4));

			}
		} catch (Exception e) {
			e.printStackTrace();		}


	}

	public void updateEmpNameById(int id, String name) {
		conn = DBConnection.createDBConnection();
		String query = "update employee set name = ? where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, id);

			int count = ps.executeUpdate();
			if(count !=0)
				System.out.println("Employee details updated successfully");


		} catch (Exception e) {
			e.printStackTrace();	
		}




	}

	public void deleteEmpById(int id) {
		conn = DBConnection.createDBConnection();
		String query = "delete employee where id = ?";

		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);

			int count = ps.executeUpdate();
			if(count !=0)
				System.out.println("Employee deleted successfully");


		} catch (Exception e) {
			e.printStackTrace();	
		}

	}

	public void Search(String name) {
		conn = DBConnection.createDBConnection();
		String query = "SELECT * FROM employee where name LIKE "+name+"%";

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4));

			}
		} catch (Exception e) {
			e.printStackTrace();		
		}

	}

	public void sortBySalary(String text) {
		conn = DBConnection.createDBConnection();
		String query = "SELECT * FROM employee ORDER BY salary";
		if(text.equals("D"))
			query = "SELECT * FROM employee ORDER BY salary DESC";

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while(rs.next()) {
				System.out.format("%d\t%s\t%f\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4));

			}
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

}
