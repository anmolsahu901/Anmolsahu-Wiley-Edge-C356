package JavaThreads;

class CloseEvent extends Thread{
	public void run() {
		
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
		
		r.addShutdownHook(new CloseEvent());
		
		for(int i=1;i<=10;i++) {
			CloseEvent1 t1 = new CloseEvent1();
			t1.start();
		}
	}

}
