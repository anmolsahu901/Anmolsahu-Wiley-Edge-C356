package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomArrayList extends ArrayList{
	
	public boolean add(Object o) {
		if(this.contains(o))
			return true;
		else
		{
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(5);
		
//		System.out.println(list);
		
//		Set<GeniusStudent> setStudents = new HashSet<>();
		List <GeniusStudent> setStudents = new ArrayList<>();
		
		
		
		GeniusStudent gs1 = new GeniusStudent(101,"Rishav"); 
		GeniusStudent gs2 = new GeniusStudent(110,"Rishav"); 
		GeniusStudent gs3 = new GeniusStudent(109,"Steve");
		GeniusStudent gs4 = new GeniusStudent(102,"Anmmol");
		GeniusStudent gs5 = new GeniusStudent(103,"MAnsi");

		
		
		setStudents.add(gs1);
		setStudents.add(gs2);
		setStudents.add(gs3);
		setStudents.add(gs4);
		setStudents.add(gs5);

		
		
		Collections.sort(setStudents);
		
		System.out.println(setStudents);
		
		
		
	}
	
	
	

}







