package com.wiley.SpringCore.A2ReferenceType;

public class Address {
	private String address;
	

	public Address(String address) {
		super();
		this.address = address;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}

	
}
