package collections;

import java.util.ArrayList;

public class LinkedListvsArrayList {

	public static void main(String[] args) {
		final ArrayList<Integer> li = new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
		li.remove(2);
		li.set(3, 234);
		
		System.out.println(li);
		
//		li = new ArrayList<>();
		
		
	}

}
