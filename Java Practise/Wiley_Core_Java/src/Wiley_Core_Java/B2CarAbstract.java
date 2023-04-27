package Wiley_Core_Java;

abstract class Vehicle{
	protected String color;
	protected int speed;
	protected int numWheels;
	
	public Vehicle(String color, int speed,int numWheels)
	{
		this.color = color;
		this.speed = speed;
		this.numWheels = numWheels;
	}
	
	public abstract void move();

}

class Car extends Vehicle{

	public Car(String color, int speed, int numWheels) {
		super(color, speed, numWheels);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Car class move");
	}
	
	public void turn() {
		System.out.println("turning left/right");
	}
	
	
}


public class B2CarAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
