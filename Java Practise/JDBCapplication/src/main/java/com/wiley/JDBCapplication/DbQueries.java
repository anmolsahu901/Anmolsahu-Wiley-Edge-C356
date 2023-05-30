package com.wiley.JDBCapplication;

import java.util.Scanner;

public class DbQueries {
	public static void main(String[] args) {
	
		
		try {
			DatabaseDaoImpl dd = new DatabaseDaoImpl();
			System.out.println("*******WELCOME TO WILEY DATABASE MANAGEMENT SYSTEM********\n");
			Scanner scan = new Scanner(System.in);
			int i;
			
			do {
			System.out.println("Press 1 to Create Database.");
			System.out.println("Press 2 to use Database.");
			System.out.println("Press 3 to drop Database.");
			System.out.println("Press 4 to create Table.");
			System.out.println("Press 5 to delete Table:");
			System.out.println("Press 6 to EXIT\n");
	
			System.out.print("Please Enter your choice: ");

			i=scan.nextInt();scan.nextLine();

			String name;
			
			switch(i) {
			case 1:
				System.out.println("\n#You have choosen to create a DB!");
				System.out.println("Enter DB NAME(STRING EX: Employee): ");
				name = scan.nextLine();
				dd.createDb(name);
				break;
			case 2:
				System.out.println("\n#You have choosen to use a DB!");
				System.out.println("Enter DB NAME(STRING EX: Employee): ");
				name = scan.nextLine();
				dd.useDb(name);
				break;
			case 3:
				System.out.println("\n#You have choosen to drop DB!");
				
				break;
			case 4:
				System.out.println("\n#You have choosen to create table");
				
				break;
			case 5:
				System.out.println("\n#You have choosen to delete table!");
				
				break;
			case 6:
				System.out.println("#You have choose to exit!");
				break;
									
			}
			}while(i != 6);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
