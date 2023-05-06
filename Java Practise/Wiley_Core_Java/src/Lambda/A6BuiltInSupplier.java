package Lambda;

import java.util.function.Supplier;

public class A6BuiltInSupplier {

	public static void main(String[] args) {
		Supplier<String> msg = () -> "Wish you happy married life Rishav raj";

		System.out.println(msg.get());
	
	}

}
