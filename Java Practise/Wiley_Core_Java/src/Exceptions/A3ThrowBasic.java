package Exceptions;

class AnmolException extends Exception{

	public AnmolException(String s) {
		super(s);
	}
}

public class A3ThrowBasic {
	public static void main(String[] args) {
		int i = 1;
		int age = 18;

		try {
			System.out.println("inside try");
			int k = age/i;

			if(i==1)
			{ // throw is used to explicitly throw an exception 
//				throw new ArithmeticException("Value can't be one");
				//throw custom Exception
				throw new AnmolException("Anmol Exception");

			}

		} catch (ArithmeticException e) {
			System.out.println("inside AE catch block : "+e);
		}

		catch (AnmolException e) {
			System.out.println("inside Anmol catch block : "+e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("inside Default catch block ");

		}

		System.out.println("statementfinal");

	}
}
