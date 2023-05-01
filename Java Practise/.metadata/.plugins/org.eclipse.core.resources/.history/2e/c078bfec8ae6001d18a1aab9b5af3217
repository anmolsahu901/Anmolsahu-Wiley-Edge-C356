package SerializationConcepts;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class A1SerializableObj {

	public static void main(String[] args) {
		
		//serialized and send to network
		Book b1 = new Book(108,"Java Essentials oijfjf");
		
		try {
			FileOutputStream fos = new FileOutputStream("books.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			fos.close();
			
			System.out.println("Task Completed");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
