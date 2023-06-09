package Lambda;

import java.util.HashMap;
import java.util.function.Function;

public class A4BuiltInFunction {

	private static HashMap<Integer,String> Employee = new HashMap<>();
	
	public static void add(String name,int ID) {
		if(!Employee.containsKey(ID)) {
			Employee.put(ID, name);
			
		}else
			System.out.println("Employee Already Exist");
	}
	
	public static void main(String[] args) {
		// Function to get the name of the employee from its ID
		Function<Integer,String> get = (Integer ID)->{
			if(Employee.containsKey(ID)) {
				return Employee.get(ID);
			}
			else return "Invalid ID";
		};
		
		//Add employee to hashmap
		add("Rishav",1901);
		add("Kritika",1902);
		add("Anmol",1903);
		add("Raj",1904);
		add("Dev",1905);
		add("Mansi",1906);
		
		System.out.println("Id = 1093, Name = "+get.apply(1903));
		
	}

}






