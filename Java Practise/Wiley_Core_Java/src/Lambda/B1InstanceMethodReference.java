package Lambda;

interface A{
	void Hii();
}

public class B1InstanceMethodReference {

	public void hello() {
		System.out.println("Hello from public class method");
	}
	
	public static void main(String[] args) {

		B1InstanceMethodReference obj = new B1InstanceMethodReference();
		A a = obj::hello;
		a.Hii();
		
		// new B1InstanceMethodReference()::hello ->>same as below one 
		Thread t1 = new Thread(obj::hello);
		t1.start();
	}

}
