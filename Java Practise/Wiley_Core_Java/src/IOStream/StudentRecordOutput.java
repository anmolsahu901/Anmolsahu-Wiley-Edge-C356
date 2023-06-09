package IOStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import IOStream.Student; 

public class StudentRecordOutput {
	DataOutputStream dataOutput;
	
	public StudentRecordOutput(String outputFile) throws IOException {
		
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
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
	
	
	public static void main(String[] args) {
//		if(args.length < 1) {
//			System.out.println("Please provide output file");
//			System.exit(0);
//		}
		
		String outputfile = "D:\\WileyEdgeTraining\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\studentout.dat";
		
		List<Student> listStudent = new ArrayList<>(); 
		
		listStudent.add(new Student(22,"venkat", true, 90.1f));
		listStudent.add(new Student(21,"Anmol", true,  81.5f));
		listStudent.add(new Student(18,"Shreya", false,  91.1f));
		listStudent.add(new Student(19,"Rishav", true,  95.1f));
		listStudent.add(new Student(33,"Aadi", true,  45.7f));
		
		try {
			StudentRecordOutput outputWriter = new StudentRecordOutput(outputfile);
			
			for(Student student: listStudent) {
				outputWriter.writer(student);
			}
			
			outputWriter.save();
			System.out.println("Data added");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}





