package Wiley_Core_Java;

public class A5InstanceOrder {
	
	int a ;
	String name;

	{
		a =10;
		name ="ANMOL";
		System.out.println("Instance block");
	}
	
	public A5InstanceOrder() {
		System.out.println("a :" +a+"  name :"+name);
		System.out.println("0 Args constructor block");
	}
	
	public A5InstanceOrder(int a,int b) {
		System.out.println("2 Args constructor"+ (a+b));
	}
	
	public static void main(String[] args) {
		A5InstanceOrder obj = new A5InstanceOrder();
	
		
		new A5InstanceOrder(1,2);
	}

}
