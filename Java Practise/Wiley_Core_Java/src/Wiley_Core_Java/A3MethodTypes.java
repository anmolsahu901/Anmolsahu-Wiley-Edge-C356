package Wiley_Core_Java;

class test{
	public static int add(int v1,int v2) {
		int val = v1 +v2;
		return val;
	}
}

public class A3MethodTypes {
	
	public void sub(int v1,int v2) {
		int val = v1 -v2;
		
		System.out.println("subtract in instance mehtod : "+val);
	}

	public void add(int v1,int v2) {
		int val = v1 +v2;
		
		System.out.println("Addition in instance mehtod : "+val);
		
		this.sub(v1,v2);
	}
	
	public static void mul(int v1,int v2) {
		int val = v1*v2;
		
		System.out.println("Multip. in static mehtod : "+val);
	}
	
	public static void main(String[] args) {
		
		mul(10,20);
		
		A3MethodTypes obj = new A3MethodTypes();
		
		obj.add(10, 30);
		
		System.out.println("static Add() from test class : "+test.add(2, 3));
		
	}

}
