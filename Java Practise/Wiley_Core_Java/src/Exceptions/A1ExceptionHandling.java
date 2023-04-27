package Exceptions;

public class A1ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("First statement");
		
		int arr[]  = {1,2,3,4};
		
//		System.out.println(arr[4]);
		try {
			System.out.println(arr[0]);
			System.out.println(arr[3]);
			
			System.out.println("statement 2");
			
			String s = "Anmol";
			
			System.out.println(s.charAt(4));
			
			System.out.println(12/0);
			
			System.out.println("statement 3");
			System.out.println("statement 4");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Catch 2");
			e.printStackTrace();
			
		}
		catch(ArithmeticException e) {
			System.out.println("Catch 3");
			e.printStackTrace();
		}
		
		System.out.println("Last statement");
	}
}
