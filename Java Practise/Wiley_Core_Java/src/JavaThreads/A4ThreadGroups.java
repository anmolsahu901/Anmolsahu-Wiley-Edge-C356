package JavaThreads;

class Demo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name : "+Thread.currentThread());
	}

}

public class A4ThreadGroups {
	public static void main(String[] args) {
		//Created groups not threads
		ThreadGroup tgParent = new ThreadGroup("Parent Group");
		ThreadGroup tgChild1 = new ThreadGroup(tgParent,"Child group");
		
		//creating thread
		Thread t1 = new Thread(tgParent,new Demo(),"First");
		Thread t2 = new Thread(tgParent,new Demo(),"Second");
		Thread t3 = new Thread(tgParent,new Demo(),"Third");

		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Active group of Threads :-"+tgParent.activeCount());
	}
}








