package collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/*
 * modify in middle of iteration will fail is called fast fast iterator
 * 
 * 
 * 
 */

// CopyOnWriteArrayList take copy of that list 
public class FailFastClass {

	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<>();
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("d");
		
		Iterator<String> iter = list.iterator();
		
		// mod count = 0 + 1 = 1
		while(iter.hasNext()) {
			String el = iter.next();
			System.out.println(el);
			list.add("c");
		}
		
		System.out.println(list);

	}

}
