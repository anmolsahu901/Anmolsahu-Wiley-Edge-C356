package StringClasses;

import java.util.*;

public class A6StringFormat {

	public static void main(String[] args) {
		//		String title = "Java Developer";
		//		float salary = 2000.39f;
		//		System.out.format("%s has %.2f USD salary",title, salary);
		//	
		List<String> techstack = Arrays.asList(
				"Essentials Java",
				"ehad first Java",
				"Java Design Patterns"
				);

		for(String book: techstack) {
			System.out.format("%-30s - in stock%n",book);
		}
		
		
	}
}
