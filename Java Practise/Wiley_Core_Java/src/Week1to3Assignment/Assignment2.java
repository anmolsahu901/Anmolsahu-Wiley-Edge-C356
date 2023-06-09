package Week1to3Assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	int id;
	String name;
	int problemSolved;
	
	public Student(int id, String name, int problemSol) {
		this.id = id;
		this.name = name;
		this.problemSolved = problemSol;
	}
	
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"anmol",50);
		Student s2 = new Student(102,"mansi",40);
		Student s3 = new Student(103,"dev",45);
		Student s4 = new Student(104,"raj",60);
		Student s5 = new Student(105,"khushi",70);
		Student s6 = new Student(106,"ravi",10);
		Student s7 = new Student(107,"kishan",30);
		Student s8 = new Student(108,"amit",33);
		Student s9 = new Student(109,"monu",58);
		Student s10 = new Student(110,"sonu",78);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);list.add(s2);
		list.add(s3);list.add(s4);
		list.add(s5);list.add(s6);
		list.add(s7);list.add(s8);
		list.add(s9);list.add(s10);
		
		Comparator<Student> comStudent = new Comparator<Student>() {
			public int compare(Student i, Student j) {
				if(i.problemSolved<j.problemSolved)// sort the list
					return 1; //swap in sorted order
				else
					return -1;
			}
		};
		
		List<Student> filterData = ((Stream<Student>) list
				.stream()
				.sorted(comStudent)
				.limit(5))
				.collect(Collectors.toList());
				
		
		for(Student s:filterData) {
			System.out.println(s.id+"\t"+s.name+"\t"+s.problemSolved);
		}
		

	
	}

}
