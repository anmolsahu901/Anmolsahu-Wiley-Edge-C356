package collections;

import java.util.*;
//comparator is a interface through which we can sort data according to our condition

class Students implements Comparable<Students>{
	int age;
	String name;
	
	
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}


	

	@Override
	public int compareTo(Students that) {
		if(this.age>that.age)// sort the list
			return 1; //swap in sorted order
		else
			return -1;
		
	}
}

public class ComparablePractise {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
//				if(i>j)// sort the list
				if(i%10 > j%10)// sort on basis of last digit
					return 1; //swap in sorted order
				else
					return -1;
			}
		};
		
		
		List<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(41);
		list.add(37);
		list.add(22);
		list.add(98);
		
//		Collections.sort(list,com);
		
		System.out.println("Sorted on the basis of last digit : "+list);

// sort String on the basis of the length of string 		
		Comparator<String> comS = new Comparator<String>() {
			public int compare(String i,String j) {
				if(i.length()>j.length())// sort the list
					return 1; //swap in sorted order
				else
					return -1;
			}
		};
		
		
		List<String> li = new ArrayList<>();
		li.add("Aidhf");
		li.add("asd");
		li.add("a");
		li.add("bv");
		li.add("jsowmasde");
		Collections.sort(li,comS);
		
//		System.out.println(li);
		
		// sort list of students on the basis of their age 
		Comparator<Students> comStudent = new Comparator<Students>() {
			public int compare(Students i,Students j) {
				if(i.age>j.age)// sort the list
					return 1; //swap in sorted order
				else
					return -1;
			}
		};
//		
		List<Students> l1 = new ArrayList<Students>();
		l1.add(new Students(45,"Anmol"));
		l1.add(new Students(23,"Aanshi"));
		l1.add(new Students(21,"Mansi"));
		l1.add(new Students(89,"Aman"));
		
//		Collections.sort(l1,comStudent);
		// using comparable : give power to class to compare itself ! 
		Collections.sort(l1);
		for(Students s :l1) {
			System.out.println(s.toString());
		}
//		
		
	}

}




