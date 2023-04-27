package Wiley_Core_Java;

class Animal{
	public void eat() {
		System.out.println("eat");
	}
	
	public void sleep() {
		System.out.println("sleep");
	}
}

class Lion extends Animal{
	public void roar() {
		System.out.println("roar");
	}
}

public class A7SingleInheritence {

	public static void main(String[] args) {
		Lion lion = new Lion();
		
		lion.eat();
		lion.sleep();
		lion.roar();
	}

}
