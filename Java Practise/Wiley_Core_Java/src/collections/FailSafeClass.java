package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeClass {

	public static void main(String[] args) {
//		Map<Integer,String> myMap = new HashMap<>();

		Map<Integer,String> myMap = new ConcurrentHashMap<>();

		
		myMap.put(1, "java");
		myMap.put(2, "python");

		Iterator<Integer> it = myMap.keySet().iterator();
		int c=3;
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println(key+" "+myMap.get(key));
			myMap.put(c++, "React");
		}
		
		
	}

}
