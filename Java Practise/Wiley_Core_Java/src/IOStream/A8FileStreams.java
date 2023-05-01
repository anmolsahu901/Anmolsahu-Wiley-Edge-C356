package IOStream;

import java.io.*;

public class A8FileStreams {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileOutputStream fout = new FileOutputStream("D:\WileyEdgeTraining\Wiley Edge Training\Java Practise\Wiley_Core_Java\data\\data4.txt");
//		
//		String s = "Wiley Full Stack Project";
//		
//		byte[] b = s.getBytes();
//		
//		fout.write(b);
//		
//		fout.flush();
//		fout.close();
		
//		System.out.println("Anmol");
		
		FileInputStream fin = new FileInputStream("D:\\WileyEdgeTraining\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data4.txt");
		
		int i=0;
		
		while((i=fin.read())!= -1) {
			System.out.println((char)i);
		}
		
		fin.close();
		
	}

}
