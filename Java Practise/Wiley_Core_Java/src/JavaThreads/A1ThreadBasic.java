package JavaThreads;
// One way to create thread is extends thread class 
// thread implements Runnable interface that have only one method Run();
class A extends Thread{
	public void run() {
		for(int i=0;i<50;i++)
		{
			System.out.println("Hii ");
			//sleep(val) this will tell the thread to wait/sleep for given milli seconds
			// surround with tryblock bcz it can give InterruptedException
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Hello ");
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}

public class A1ThreadBasic {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		//		a.show();
		//		b.show();

		// priority ranges 1-10, 10 is max priority 1 is least default priority of thread is 5
//		System.out.println(a.getPriority()); 

		// setPriority will suggest scheduler to give this thread given priority 
		// suggest only !! Not guarantee that it will be perform depends of time, scheduler type
//		b.setPriority(Thread.MAX_PRIORITY);

		//start() Causes this thread to begin execution;
		//the Java Virtual Machine calls the run method of this thread. 
		a.start();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.start();

	}

}
