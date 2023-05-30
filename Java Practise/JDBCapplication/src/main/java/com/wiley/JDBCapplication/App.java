package com.wiley.JDBCapplication;

/**
 * Hello world!
 *
 */
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
    	
//    	
//    	try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wileyclassic","root","Arpita@485")){
//    		System.out.println("Connection success");
//    		
//    		dBConnection con = new dBConnection();
//    		Connection dbc = con.createConnection();
//    		
//    		Statement st = dbc.createStatement();
//    		
//    		String sql = "Select first_name, last_name from candidates";
//    		
//    		ResultSet rs = st.executeQuery(sql);
//    		while(rs.next()) {
//    			System.out.println(rs.getString(1) + " - " + rs.getString(2));
//    		}
//    		
//    		try {
//    			rs.close();
//    			st.close();
//    		} catch(SQLException e) {
//    			e.printStackTrace();
//    		}
//    	} catch(Exception e) {
//    		
//    	}
    	
    	try {
    		EmployeeDaoImpl ed = new EmployeeDaoImpl();
    		System.out.println("*******WELCOME TO WILEY EMPLOYEE MANAGEMENT SYSTEM********\n");
    		Scanner scan = new Scanner(System.in);
    		int i;
    		do {
    			System.out.println("Press 1 to Create Employee.");
    			System.out.println("Press 2 to see all Employees.");
    			System.out.println("Press 3 to see Employee by Id.");
    			System.out.println("Press 4 to update name of Employee by Id.");
    			System.out.println("Press 5 to delete Employee by ID:");
    			System.out.println("Press 6 to sort Employee by salary:");
    			System.out.println("Press 7 to search Employee by Name:");
    			System.out.println("Press 8 to EXIT\n");

    			
    			System.out.print("Please Enter your choice: ");

    			i=scan.nextInt();scan.nextLine();

    			int id,salary,age;
    			String name;
    			
    			
    			switch(i) {
    				case 1:
    					System.out.println("#You have choosen to create an Employee!\n");
    					System.out.println("Enter Employee ID(ONLY INTEGER EX: 123): ");
    					 id = scan.nextInt();scan.nextLine();
    					System.out.println("Enter Employee NAME(STRING EX: Raj): ");
    					 name = scan.nextLine();
    					System.out.println("Enter Employee salary(ONLY INTEGER EX: 12000): ");
    					 salary = scan.nextInt();scan.nextLine();
    					System.out.println("Enter Employee AGE(ONLY INTEGER EX: 12): ");
    					 age = scan.nextInt();scan.nextLine();
    					
    					Employee e = new Employee(id, name, salary, age);
   				//	 System.out.println(id+name+salary+age);

    					ed.createEmployee(e);
    					break;
    				case 2:
    					System.out.println("\n#You have choosen to see all Employees!");
    					ed.getAllEmployee();
    					break;
    				case 3:
    					System.out.println("\n#You have choosen to see an Employee by ID!");
    					System.out.println("Enter Employee ID(ONLY INTEGER EX: 123): ");
    					 id = scan.nextInt();scan.nextLine();
    					ed.getEmployeeById(id);
    					break;
    				case 4:
    					System.out.println("\n#You have choosen to update name of an Employee by ID!");
    					System.out.println("Enter Employee ID(ONLY INTEGER EX: 123): ");
    					id = scan.nextInt();scan.nextLine();
    					System.out.println("Enter Employee NAME(STRING EX: Raj): ");
    					name = scan.nextLine();
    					ed.updateEmployeeById(id, name);
    					break;
    				case 5:
    					System.out.println("\n#You have choosen to delete Employee by ID!");
    					System.out.println("Enter Employee ID(ONLY INTEGER EX: 123): ");
    					id = scan.nextInt();scan.nextLine();
    					ed.deleteEmployeeById(id);
    					break;
    				case 6:
    					System.out.println("\n#You have choose to sort the employees!");
    					System.out.println("select 1 to sort in ASC else in DESC");
    					int s = scan.nextInt();scan.nextLine();
    					ed.sortSalary(s);		
    					break;
    				case 7:
    					System.out.println("\n#You have choosen to search Employee by Name!");
    					System.out.println("Enter Employee NAME(STRING EX: Raj): ");
    					name = scan.nextLine();
    					ed.searchEmployeeByName(name);   					
    					break;
    				case 8:
    					System.out.println("#You have choose to exit!");
    					break;
    				default:
    					System.out.println("Please Enter valid option!!!!!!!!!!!!!!!!!");
    					continue;
    			}
    				
    			
    		}while(i != 8);
    		
    	}catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
		}
    }
}
