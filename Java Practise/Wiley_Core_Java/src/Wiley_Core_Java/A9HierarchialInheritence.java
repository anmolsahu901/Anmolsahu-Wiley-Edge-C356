package Wiley_Core_Java;

class Vehicle1{
	public void steering() {
		System.out.println("steering");
	}
}

class Car1 extends Vehicle1{
	public void airbag() {
		System.out.println("airbag");
	}
}

class Truck extends Vehicle1{
	public void HydraulicPump() {
		System.out.println("HydraulicPump");
	}
}


public class A9HierarchialInheritence {

	public static void main(String[] args) {
		Truck t = new Truck();
		t.steering();

	}

}
