package Lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
// functional 
public class A5BiFunctionClass {

	public static void main(String[] args) {
//		UnaryOperator<Integer> n = a -> a^1;
//		System.out.println(n.apply(0));		
		
		BinaryOperator<Integer> n = (a,b) -> a & b;
		System.out.println(n.apply(12,4));
		
		
		
	}

}
