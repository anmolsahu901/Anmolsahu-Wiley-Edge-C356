package JavaThreads;

/*
 *Thread class implements Runnable interface that have only one method Run();
 *so if instead of Thread class we can implement Runnable interface but the problem is now we can't use
 * methods like start() its of Thread class so 
 * for this we have to create Thread object and pass child class obj of Runnable Parent to thread constructor
 *  Thread have Constructor which takes Runnable obj this will tell Thread to what to execute
 * 
 */

class C implements Runnable{
	public void run() {
		for(int i=0;i<50;i++)
		{
			System.out.println("Hello C ");
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

class D implements Runnable{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("Hello D");
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
}


public class A1ThreadBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		Runnable d = new D();
		/*Runnable e = new Runnable() {
			public void run() {
				for(int i=0;i<50;i++) {
					System.out.println("Hello D");
					try {
						Thread.sleep(100); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}			
				}
			}
		};*/
		
		// creating Runnable obj using lambda expression 
		Runnable e = ()-> {
				for(int i=0;i<50;i++) {
					System.out.println("Hello E");
					try {
						Thread.sleep(100); 
					} catch (InterruptedException ex) {
						ex.printStackTrace();
					}			
				}
			};
		
		
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(new D());
		Thread t3 = new Thread(e);

		
		t1.start();
		t2.start();
		t3.start();

	}

}
