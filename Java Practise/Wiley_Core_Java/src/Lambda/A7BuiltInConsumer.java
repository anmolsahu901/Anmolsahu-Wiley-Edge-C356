package Lambda;

import java.util.function.BiConsumer;

public class A7BuiltInConsumer {

	public static void main(String[] args) {
		BiConsumer<Integer,Integer> el = (age,percent)->{
			if(age>18 && percent >75) {
				System.out.println("You are eligible for the Job");
			}
			else {
				System.out.println("You are not eligible for the job");
				
			}
		};
		
		el.accept(22, 78);
		el.accept(18, 76);
		
		
	
	}

}
