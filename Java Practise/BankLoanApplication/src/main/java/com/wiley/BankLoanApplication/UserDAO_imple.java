package com.wiley.BankLoanApplication;

import java.sql.*;
import java.util.Scanner;



public class UserDAO_imple implements UserDAO{

	Connection con= null;

	UserDAO_imple(){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 1 for register And 2 for login : ");
		int choice = obj.nextInt();
		switch(choice){
		case 1:
		{
			System.out.println("Enter Full name");
			String name = obj.nextLine();
			System.out.println("Enter account number");
			String acc_number = obj.next();
			obj.nextLine();
			System.out.println("Enter mobile number");
			String mobile = obj.nextLine();

			System.out.println("Enter address");
			String address = obj.nextLine();

			System.out.println("Enter gender");
			String gender = obj.nextLine();
			System.out.println("Enter pan number");
			String pan = obj.nextLine();
			System.out.println("Enter Date of birth(Eg:2003-01-27) : ");
			String dob = obj.nextLine();
			System.out.println("Enter account type(1 for current 2 for saving) : ");
			int acc_type = obj.nextInt();
			obj.nextLine();

			User user = new User(acc_number, name,mobile,address,gender,pan,dob,acc_type);
			addUser(user); break;
			
		}
		case 2:{
			System.out.println("Enter account number");
			String acc = obj.next();
			obj.nextLine();
			System.out.println("Enter name");
			String n = obj.nextLine();
			loginUser(acc,n);
			
			break;
		}
		default :
			System.out.println("Invalid input");
			
		}


	}

	public void addUser(User user) {
		con =  dBConnection.createConnection();
		String q = "INSERT INTO user (acc_number, name, mobile, address, gender, pan_number, dob, account_type_id)\r\n"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

		try {
			PreparedStatement ps = con.prepareStatement(q);

			ps.setString(1,user.getAcc_number());
			ps.setString(2, user.getName());
			ps.setString(3,user.getMobile());
			ps.setString(4,user.getAddress());
			ps.setString(5,user.getGender().toLowerCase());
			ps.setString(6,user.getPancard().toUpperCase());
			ps.setString(7,user.getDob());
			ps.setInt(8,user.getAcc_type());



			int count = ps.executeUpdate();
			if(count != 0) {
				System.out.println("New User added successfully !!!!!!");
			}
			ps.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//		

	}

	
	public void loginUser(String acc_number, String name) {
		con =  dBConnection.createConnection();
		String q = "SELECT * FROM user where acc_number LIKE "+acc_number;

		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);


			if(rs.next())
			{
				System.out.println("Login SuccessFull");
			}
			
			else
				System.out.println("Invalid input");
			
			st.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}		

	}




}
