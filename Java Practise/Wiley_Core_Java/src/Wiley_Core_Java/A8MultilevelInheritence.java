package Wiley_Core_Java;

class Vehicle{
	public void tier() {
		System.out.println("Tier");
	}
	public void steering() {
		System.out.println("steering");
	}
	public void airbag() {
		System.out.println("airbag");
	}
}

class SmartCar{
	public void sensor() {
		System.out.println("sensor");
	}
}


public class A8MultilevelInheritence {

	public static void main(String[] args) {
		SmartCar sc = new SmartCar();
		
		sc.sensor();
	}

}
