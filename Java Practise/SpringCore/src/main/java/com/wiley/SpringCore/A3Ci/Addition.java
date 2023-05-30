package com.wiley.SpringCore.A3Ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Cons double");

	}
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Cons int");
	}
	
	
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Cons String");
	}
	
	public void doSum() {
		System.out.println("first : "+this.a+"\tsecond : "+this.b);
		System.out.println("Sum is = "+ (this.a+this.b));
	}
	
}
