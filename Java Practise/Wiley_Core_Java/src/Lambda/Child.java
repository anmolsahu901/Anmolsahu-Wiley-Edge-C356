package Lambda;
/*
 * functional interface can have only 1 abstract method
 * but multiple default methods and static method
 * also can have methods of object class these are abstract
 * 
 */
@FunctionalInterface
public interface Child extends Parent{
	public void sayHello();

	
	default void sayhii() {
		
	}

	// methods of object class
	String toString();
//	 String hashCode();
	boolean equals(Object o);
//	
}
