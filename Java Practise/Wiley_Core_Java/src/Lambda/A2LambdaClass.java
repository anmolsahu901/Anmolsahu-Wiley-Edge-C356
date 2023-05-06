package Lambda;

public class A2LambdaClass {

	static String printThing(Printable thing) {
		return thing.print(" Edge");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1Product myProd = new A1Product();
//		myProd.print();
		
//		printThing(myProd);
		
		// using lambda expression
//		printThing(()->{
//			System.out.println("Lambda Expression");
//		});
		
//		Printable LambdaPrinciple = s->System.out.println(s+" USING Lambda Expression");
//		Printable LambdaPrinciple = (s1,s2)->System.out.println(s1+" USING Lambda Expression"+s2);

//	Printable LambdaPrinciple = s->{
//		System.out.println(s+" USING Lambda Expression");
//		return "Wiley"+s;
//	};
	
	Printable LambdaPrinciple = s-> "Wiley"+s;
	System.out.println(printThing(LambdaPrinciple));
		
		
		
		
	}

}
