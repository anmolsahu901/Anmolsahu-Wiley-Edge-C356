package com.wiley.SpringCore.B1autowire;

public class Emp {
	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Emp setter");

	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Emp constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
