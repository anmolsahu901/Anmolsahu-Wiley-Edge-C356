package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A9AbstractStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		OutputStream fout = new FileOutputStream("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data4.txt");
//		
//		String s = "Wiley Full Stack Project";
//		
//		byte[] b = s.getBytes();
//		
//		fout.write(b);
//		
//		fout.flush();
//		fout.close();
		
		InputStream fin = new FileInputStream("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data4.txt");
		
		int i=0;
		
		while((i=fin.read())!= -1) {
			System.out.print((char)i);
		}
		
		fin.close();
	}

}
