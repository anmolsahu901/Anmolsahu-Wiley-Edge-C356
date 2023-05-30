package com.wiley.SpringCore.A4lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// 2 : implementing bean using interface 
//Intitializing bean
// Disposable bean

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of pepsi");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destory
		System.out.println("Pepsi Destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		// init ()
		System.out.println("Pepsi init()");
		
	}
	
	
}
