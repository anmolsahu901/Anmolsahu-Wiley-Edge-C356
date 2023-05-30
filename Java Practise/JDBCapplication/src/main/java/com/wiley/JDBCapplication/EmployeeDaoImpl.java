package com.wiley.JDBCapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao {
	Connection con; 
	
	public void createEmployee(Employee emp) {
		con =  dBConnection.createConnection();
		String q = "Insert into Employee values(?,?,?,?)";	
		
		try {
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			ps.setInt(4, emp.getAge());
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("Employee Created!!!!!!");
			}
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void getAllEmployee() {
		con =  dBConnection.createConnection();
		String q = "SELECT * FROM employee";
		System.out.println("--------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t","ID","NAME","SALARY","AGE");
		System.out.println("--------------------------------------");
	
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%d\t%d\t\n",
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getInt(4)
						);
				System.out.println("--------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public void deleteEmployeeById(int id) {
		con =  dBConnection.createConnection();
		String q = "delete FROM	Employee where id="+id;	
		
		try {
			PreparedStatement ps = con.prepareStatement(q);

			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("Employee deleted!!!!!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void getEmployeeById(int id) {
		con =  dBConnection.createConnection();
		String q = "SELECT * FROM employee where id="+id;
		System.out.println("--------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t","ID","NAME","SALARY","AGE");
		System.out.println("--------------------------------------");
	
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			while(rs.next()) {
				System.out.printf("%d\\t%s\\t%d\\t%d\\t",
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getInt(4)
						);
				System.out.println("--------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public void updateEmployeeById(int id, String name) {
		con =  dBConnection.createConnection();
		String q = "UPDATE Employee set name = ? where id = ?";
	
		try {
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, name);
			ps.setInt(2, id);
			
			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("Employee updated!!!!!!");
			}
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sortSalary(int i) {
		con =  dBConnection.createConnection();
		String q;
		if(i==1) {
			q = "SELECT * FROM employee ORDER BY salary";
		} else {
			q = "SELECT * FROM employee ORDER BY salary DESC";
		}
		try {
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery(q);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%d\t%d\t\n",
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getInt(4)
						);
				System.out.println("--------------------------------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchEmployeeByName(String name) {
		con = dBConnection.createConnection();
		String q = "SELECT * FROM Employee WHERE name like'"+name+"'";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			while(rs.next()) {
				System.out.printf("%d\t%s\t%d\t%d\t\n",
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getInt(4)
						);
				System.out.println("--------------------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
