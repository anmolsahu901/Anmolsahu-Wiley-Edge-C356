package Exceptions;

import java.util.ArrayList;

class StudentNotFound extends RuntimeException{
	public StudentNotFound(String message) {
		super(message);
	}
}

public class A5Unchecked {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		students.add("Venkat");
		students.add("Anjali");
		students.add("Rishav");
		
		if(!students.contains("Venkata"))
		{
			try {
				throw new StudentNotFound("This Student is not found");
			} 
			catch (StudentNotFound e) {
				e.printStackTrace();
				e.getMessage();
			}
		}
		System.out.println("Message 1");
		System.out.println("Message 2");
	}

}
