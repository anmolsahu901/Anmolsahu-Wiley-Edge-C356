package com.wiley.SpringCore.B2autowire.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired  // use bytype
	@Qualifier("emp2") // tell that use this bean 
	Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired //use byName
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Emp setter");

	}
//	@Autowired //use byconstructor
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
