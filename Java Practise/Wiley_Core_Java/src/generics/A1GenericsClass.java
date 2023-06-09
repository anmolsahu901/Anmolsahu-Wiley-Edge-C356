package generics;

import java.util.ArrayList;
import java.util.List;

public class A1GenericsClass {

	public static void main(String[] args) {
		//		Printer<Double> printer = new Printer<Double>(27.4);
		//		Printer<String> printer2 = new Printer("27.4");
		//		Printer<Integer> printer3 = new Printer(900.6);
		//
		//		
		//		printer.print();
		//		printer2.print();
		//		printer3.print();
		//		

		Printer<Cat> printer = new Printer(new Cat());
		printer.print();

		Printer<Dog> printer1 = new Printer<Dog>(new Dog());
		printer1.print();

		ArrayList<Object> cats = new ArrayList<>();
		cats.add(new Cat());
		cats.add(new Cat());
		cats.add(new Dog());

		//		shout("Tame me to movie");
		//		shout("bring necklace");
		//		shout(new Dog());
		//		shout("Amount",200000000);
		//		shout(98.3,new Dog());

		ArrayList<Integer> intlist = new ArrayList<>();
		intlist.add(3);
		intlist.add(7);
		intlist.add(null);
		printList(intlist);

		List<Cat> catlist = new ArrayList<>();
		catlist.add(new Cat());
		printList(catlist);

	}
	//	Generic :<Key, value>
	//Generic :<value>
	// single argument
	public static <T>void shout(T shoutOut){
		System.out.println(shoutOut+"....!!!!!!!!!");
	}

	
	// return nothing 2 arguments
	public static <T,V>void shout(T shoutOut,V valtoBring){
		System.out.println(shoutOut+"....!!!!!!!!!");
		System.out.println(valtoBring+"....!!");
	}

	//return something
	public static <T,V> T shout1(T shoutOut,V valtoBring){
		System.out.println(shoutOut+"....!!!!!!!!!");
		System.out.println(valtoBring+"....!!");

		return shoutOut;
	}
	
	/// object instead of ? will give error
		public static void printList(List<?> list) {
			System.out.println(list);
		}




}














