package Exceptions;

// in java uncaught exception occurs when an exception is thrown with in a method
//and there is no code in place to catch and handle the exception. When this happens
//, the exception is is propagated up the call stack until it is caught by an
//appropriate exception handler or until it reached the top of the call stack
//and is terminated.
public class A6ExceptionPropagation {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("Exception caught : "+e.getMessage());
			
		}
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception  {
		throw new Exception("Exception occured in the method 2");
	}

}
