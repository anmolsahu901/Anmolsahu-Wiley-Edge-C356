package Lambda;

interface Anmol{
	void hii();
}

public class A9StaticMethodReference{

	public static void Hello() {
		System.out.println("Method of public class says Hii");
	}
	
	public static void process() {
		System.out.println("Processing");
	}
	
	public static void main(String[] args) {
		//Referring static method
		Anmol a = A9StaticMethodReference::Hello;
		//Calling interface method
		//////////new Thread(Runnable obj) ;Runnable is functional interface
		Thread t1 = new Thread(A9StaticMethodReference::process);
		t1.start();
		
		
		a.hii();

	}

}
