package JavaThreads;
// https://www.javatpoint.com/ShutdownHook-thread
//A special construct that facilitates the developers to add some code that has to be run when
//the Java Virtual Machine (JVM) is shutting down is known as the Java shutdown hook. 

class CloseEvent extends Thread{
	public void run() {
		 System.out.println("shut down hook task completed..");    
	}
}

class CloseEvent1 extends Thread{
	public void run() {
		System.out.println("Current Thread"+Thread.currentThread().getName());
	}
}

public class A5ShutDownThrread {

	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		CloseEvent c = new CloseEvent();
		
//The addShutdownHook() method of the Runtime class is used to register the thread
//with the Virtual Machine.

		
		r.addShutdownHook(c); 
		c.start();
		
		for(int i=1;i<=10;i++) {
			CloseEvent1 t1 = new CloseEvent1();
			t1.start();
		}
/*The removeShutdownHook() method of the Runtime class is invoked to remove the 
 * registration of the already registered shutdown hooks.
 */
		r.removeShutdownHook(c);
	}

}
