package Lambda;

/*
 * SAM single abstract method
 * default and static method can hold
 */
@FunctionalInterface
public interface Printable {
	public static final int i = 0;
	public static final String j = "";
	
	static void display() {
		System.out.println("Display");
	}
	
//	void print(String suffix,String name);
	String print(String suffix);
	
	default void sayHi() {
		System.out.println("Hii");
	}
	
}
