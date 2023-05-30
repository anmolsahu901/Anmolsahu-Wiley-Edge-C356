package com.wiley.SpringCore.A4lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Samosa {
private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of Smaosa");
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Init samosa()");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy samosa()");

	}
	
}
