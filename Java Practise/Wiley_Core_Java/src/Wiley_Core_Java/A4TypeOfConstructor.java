package Wiley_Core_Java;

public class A4TypeOfConstructor {

	public A4TypeOfConstructor(int  a,int b){
		System.out.println("2 args constructor : "+(a+b));
	}
	public A4TypeOfConstructor(float a,int b){
		this(10,20);
		System.out.println("2 args f constructor : "+(a+b));
	}
	
	
	public A4TypeOfConstructor() {
		System.out.println("0 args constructor");
	}
	
	void add() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4TypeOfConstructor obj = new A4TypeOfConstructor();
		
		A4TypeOfConstructor obj1 = new A4TypeOfConstructor(34.831f,111);
	}

}
