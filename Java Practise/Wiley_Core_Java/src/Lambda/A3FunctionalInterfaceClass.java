package Lambda;

interface Calc{
	int calculate(int val);
	
	default int add(int a,int b) {
		return a+b;
	}
}

public class A3FunctionalInterfaceClass {

	public static void main(String[] args) {
		Calc cl = (val)-> val+5;
		
		//call method
		System.out.println("Result : "+cl.calculate(5));
		System.out.println(cl.add(8, 9));
		
	}
}
