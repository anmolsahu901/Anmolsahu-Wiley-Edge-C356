package Wiley_Core_Java;

public class A6staticBlock {
	
	static {
		System.out.println("Static Block");
	}

	
	{
		System.out.println("Instance Block");
	}
	
	A6staticBlock(){
		System.out.println("Default Constructor");
	}
	public static void main(String[] args) {
		A6staticBlock obj = new A6staticBlock();
		
		new A6staticBlock();
		new A6staticBlock();
		new A6staticBlock();
	}

}
