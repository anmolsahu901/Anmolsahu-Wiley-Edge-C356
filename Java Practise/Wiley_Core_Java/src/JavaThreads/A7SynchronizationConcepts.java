package JavaThreads;

// Synchronization capability to control the access of multiple threads to any shared resource
//https://www.javatpoint.com/synchronization-in-java
// why use :
/*
 * to prevent thread interface to another thread
 * to prevent consistency problem , provide consistency 
 */

class Sheet{
	
	public void writeln(int k) {
		synchronized (this){  //synchronized block  
			for(int i=0;i<=10;i++) {
				System.out.println(i*k);
			}
		}
//		for(int i=0;i<=10;i++) {
//			System.out.println(i*k);
//		}
	}
}

class Person1 extends Thread{
	Sheet st;
	public Person1(Sheet st) {
		super();
		this.st = st;
	}
	
	public void run() {
		st.writeln(1);
	}
}

class Person2 extends Thread{
	Sheet st;
	public Person2(Sheet st) {
		super();
		this.st = st;
	}
	
	public void run() {
		st.writeln(10);
	}
}


public class A7SynchronizationConcepts {

	public static void main(String[] args) {
		Sheet st = new Sheet();
		Person1 t1 = new Person1(st);
		Person2 t2 = new Person2(st);
		
		//sometimes person one started first sometimes 2
		t1.start();
		t2.start();
		
	}

}
