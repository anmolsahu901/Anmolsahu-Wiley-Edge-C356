package Wiley_Core_Java;

class Base{
	int i = 10;
	public void print() {
		System.out.println("Value of i = "+i);
	}
	
	public void Hii() {
		System.out.println("Base Hii");
	}
}

class Derived extends Base{
	int i = 20;
	public void print() {
		System.out.println("i = "+i);
	}
	
	public void Hii() {
		System.out.println("Derived Hii");
	}
}

public class A12RunTimePolymorphism {

	public static void main(String[] args) {
		Derived d = new Derived();
		
		
		
		Base obj = new Derived();
		obj.print();
		obj.Hii();
		

	}

}
