package Exceptions;
// throws __Exception in that method implies that I will handle Exception
// the one who invoke me it will handle the Exception
// if at last main() also throws Exception then main method is handled by jvm so it stop execution
// so don't practise that thing instead surround by try catch


public class A3ThrowsBasic {

	public static void show() throws ClassNotFoundException {
//		try {
			Class.forName("anmol");
//		}catch(ClassNotFoundException e) {
//			System.out.println("Not able find class "+e);
//		}
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			show();
		} catch (ClassNotFoundException e) {
			System.out.println("Handling Exception from main catch");
		}
		System.out.println("last statement");
	}

}
