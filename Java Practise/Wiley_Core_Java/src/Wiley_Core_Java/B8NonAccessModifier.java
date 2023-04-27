package Wiley_Core_Java;

public class B8NonAccessModifier {

	private static int count = 0;
	private final String name;
	
	public B8NonAccessModifier(String name)
	{
		this.name = name;
	}
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		

	}

}
