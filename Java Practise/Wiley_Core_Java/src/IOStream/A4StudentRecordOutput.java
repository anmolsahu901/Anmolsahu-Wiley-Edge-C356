package IOStream;

import java.io.*;
import java.util.*;

public class A4StudentRecordOutput {
	DataOutputStream dataOutput;
	
	A4StudentRecordOutput(String outputfile) throws FileNotFoundException{
		dataOutput = new DataOutputStream(new FileOutputStream(outputfile));
	}
	public void writer(Student student) throws IOException {
		dataOutput.writeUTF(student.getName());
		dataOutput.writeBoolean(student.getGender());
		dataOutput.writeInt(student.getAge());
		dataOutput.writeFloat(student.getGrade());

	}
	
	public void save() throws IOException {
		dataOutput.close();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		if(args.length<1) {
			System.out.println("Please provide output file");
			System.exit(0);
		}
		
		String outputfile = args[0];
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(28,"ANmol",true,90.4f));
		list.add(new Student(22,"Amol",true,90.4f));
		list.add(new Student(25,"Rishav",true,80f));
		list.add(new Student(21,"Rohit",true,78.4f));
		
		 try {
			A4StudentRecordOutput obj = new A4StudentRecordOutput(outputfile);
			for(Student st:list) {
				obj.writer(st);
			}
			obj.save();
//			obj.close();
			
		 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
