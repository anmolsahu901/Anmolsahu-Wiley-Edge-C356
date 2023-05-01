package IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A1BODtream {
	public static void main(String[] args) throws IOException {
		
		//write in file
	/*	FileOutputStream fout = new FileOutputStream("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data1.txt");
		BufferedOutputStream bof = new BufferedOutputStream(fout);
		
		String str = "I am a programer";
		
		byte[] b = str.getBytes();
		
		try {
			bof.write(b);
//			bof.flush(); from stream we are discarding the data
			bof.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		FileInputStream fin = new FileInputStream("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data1.txt");
		BufferedInputStream bis = new BufferedInputStream(fin);
		
		int i;
//		try {
		while((i = bis.read()) !=-1) { //check if not empty
			System.out.print((char)i);
		}
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		
		bis.close();
		fin.close();
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	