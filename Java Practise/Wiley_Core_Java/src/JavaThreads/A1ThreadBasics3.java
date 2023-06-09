package JavaThreads;
//synchronized keyword : only one thread can access that method at a time 
// this will prevent race condition : this condition comes when more than one thread 
// access variable/method at same time like here increment() this will give uneven output

//join() tells the main method to wait till the threads die then join other threads to main threads
//join(10); //wait for 10 milisecond whether t2 die or not 

class Counter{
	int count=0;
	
	public synchronized void increment() {
		count++;
	}
}

public class A1ThreadBasics3 {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();
		
		Runnable a = ()-> {
			for(int i=0;i<10;i++) {
				c.increment();
				System.out.println("hi a");
			}
		};
		
		Runnable b = ()-> {
			for(int i=0;i<10;i++) {
				c.increment();
				System.out.println("hi b");

			}
		};
		
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		t1.start();
//		System.out.println(c.count);
		t2.start();
		
		//join() tells the main method to wait till the threads completes then start with next
		// line of programs
		t1.join();
		t2.join();

		System.out.println(c.count);
	}

}
