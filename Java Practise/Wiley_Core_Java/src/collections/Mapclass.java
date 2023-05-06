package collections;

import java.util.HashMap;
import java.util.Map;


public class Mapclass {

	public static void main(String[] args) {
		Map<String,String> ss = new HashMap<>();
		ss.put("a", "abs");
		ss.put("d", "abs");
		ss.put("c", null);
		ss.put(null, null);
		ss.put(null, "dhsoj");
		ss.put("b", "abc");
// map reference ordered by key by default 
		System.out.println(ss);
//	
		// int internally uses object hashing
		//unique key and duplicate values
		HashMap<String,Integer> empIds = new HashMap<>();
		empIds.put("Venkat",12334 );
		empIds.put("Rishav", 65893);
		empIds.put("Shivam",63455 );
		empIds.put("Sachin", 78643);
		empIds.put("Krithika", 45556);
		
		System.out.println(empIds);
		System.out.println(empIds.containsKey("Rishav"));
		System.out.println(empIds.containsValue(12334));
		
		empIds.put("Venkat", 999);
		empIds.replace("Sachins", 78643); // if key present thme replace
		System.out.println(empIds);
		
		
		
	}

}








