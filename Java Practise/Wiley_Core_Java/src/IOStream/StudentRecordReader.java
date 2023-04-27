package IOStream;

import java.util.*;
import java.io.*;

public class StudentRecordReader {

	DataInputStream dataInput;
	
	public StudentRecordReader(String inputfile) throws FileNotFoundException {
		dataInput = new DataInputStream(new FileInputStream(inputfile));
		
	}
	
	//data in byte
	public List<Student> readAll() throws IOException{
		List<Student> listStudent = new ArrayList<>();
		
		try {
			while(true) {
				String name = dataInput.readUTF();
				boolean gender = dataInput.readBoolean();
				int age = dataInput.readInt();
				float grade = dataInput.readFloat();
				
				Student student = new Student(age,name,gender,grade);
				listStudent.add(student);
			}
		}
			catch(Exception e) {
				
			}
		dataInput.close();
		return listStudent;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputfile = "D:\\\\practise\\\\Wiley Edge Training\\\\Java Practise\\\\Wiley_Core_Java\\\\data\\\\studentout.dat";
		try {
			StudentRecordReader obj = new StudentRecordReader(inputfile);
			List<Student> list = obj.readAll();
			
			for(Student st : list) {
				System.out.println(st.getName()+"\t"+
									st.getGender()+"\t"+st.getAge()+
									"\t"+st.getGrade());
			}
			
		}catch(Exception ex) {
			
		}
	}

}













