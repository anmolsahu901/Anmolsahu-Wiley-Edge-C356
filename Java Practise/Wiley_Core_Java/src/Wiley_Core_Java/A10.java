package Wiley_Core_Java;

class A{
	public void HelloA() {
		System.out.println("HelloA");
	}
}

class B extends A{
	public void HelloB() {
		System.out.println("HelloB");
	}
}

class C extends A{
	public void HelloC() {
		System.out.println("HelloC");
	}
}

class D extends B{
	public void HelloD() {
		System.out.println("HelloD");
	}
}

class E extends D{
	public void HelloE() {
		System.out.println("HelloE");
	}
}

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj = new E();
		
		obj.HelloE();
		obj.HelloD();
		obj.HelloB();
		obj.HelloA();
		
		C obj1 = new C();
		
	}

}
