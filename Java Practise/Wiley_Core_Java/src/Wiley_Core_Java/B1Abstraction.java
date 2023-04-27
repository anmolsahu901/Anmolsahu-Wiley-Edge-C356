package Wiley_Core_Java;

abstract class Test1{
	public abstract void m1();
	
	{
		System.out.println("test1 instance block");
	}
	
	static {
		System.out.println("test1 static block");
	}
	
	Test1(){
		System.out.println("Test1 constructor");;
	}
	
	public void m2() {
		System.out.println("Test1 m2 method");
	}
	
	public static void main(String []args) {
		System.out.println("TEst1 main method");
	}
}

class Test2 extends Test1{

	{
		System.out.println("test2 instance block");
	}
	
	static {
		System.out.println("test2 static block");
	}
	
	Test2(){
		System.out.println("Test2 constructor");;
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("test2 m1 method");
	}
	
}

public class B1Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t2 = new Test2();
		Test2 t3 = new Test2();
//		t2.m1();
//		t2.m2();
		
//		Test1 t = new Test2();
//		t.m1();
		
		Test1.main(args);
		
	}

}
