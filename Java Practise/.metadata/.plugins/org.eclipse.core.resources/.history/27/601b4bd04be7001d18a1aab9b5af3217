package JavaThreads;

// this ois low priority thread that performs background operations 
//such as garabage collection, finalizer, Action

class SupportClass extends Thread{
	
	public void run() {
		// check if demon thread
		if(Thread.currentThread().isDaemon()) {
			System.out.println("this is a demon");
		}
		else
			System.out.println("this is not demon");

	}
}

public class A7DaemonThread {
	public static void main(String[] args) {
		SupportClass t1 = new SupportClass();
		SupportClass t2 = new SupportClass();
		SupportClass t3 = new SupportClass();

		
		t2.setDaemon(true);
		t1.setDaemon(true);

		t2.start();
		t1.start();
		t3.start();
		
	}
}
