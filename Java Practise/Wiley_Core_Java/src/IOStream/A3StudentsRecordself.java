package IOStream;

import java.io.*;
import java.util.ArrayList;

class Students{
	public Students(int age, String name, String gender, String grade) {

		this.age = age;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}
	private	int age;
	private String name,gender,grade;

	
	public String toString() {
		return name +" "+age+" "+gender+" "+grade;
	}
}

public class A3StudentsRecordself {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student(22,"Anmol","Male","B"));
		list.add(new Student(36,"Venkat","Male","A+"));
		list.add(new Student(22,"Rishav","Male","A"));
		list.add(new Student(22,"Kritika","Male","A"));
		list.add(new Student(22,"Raj","Male","A+"));

		FileOutputStream fout = new FileOutputStream("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\students.txt");
		BufferedOutputStream bof = new BufferedOutputStream(fout);

		String s = "";
		for(int i=0;i<list.size();i++) {
			s+= list.get(i).toString()+"\n";
		}

		byte[] b = s.getBytes();

		try {
			bof.write(b);
			bof.flush(); 
			bof.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
