package collections;

import java.util.TreeSet;

public class Treesetclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(98);
		set.add(8);
		set.add(4);
		set.add(2);
		set.add(78);
		
		System.out.println(set);
		System.out.println(set.floor(97));
		System.out.println(set.last());
		System.out.println(set.pollFirst());
		System.out.println(set.headSet(8)); //<obj
		System.out.println(set.lower(8));
		System.out.println(set.tailSet(8)); //>=obj
		System.out.println(set.subSet(8,78)); // obj1 <= & <obj2              
	}

}
