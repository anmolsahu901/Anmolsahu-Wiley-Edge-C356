package com.wiley.SpringCore.A4lifeCycle;



// Bean lifecycle using XML 
 
public class Pizza {
	private double price ;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of pizza");
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	

	public void start() {
		System.out.println("Inside pizza init()");
	}
	

	public void end() {
		System.out.println("Inside pizza destroy()");
	}
	
}
