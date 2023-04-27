package IOStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A2DataStreamClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//write in the data2 file
//		FileOutputStream fout = new FileOutputStream("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data2.txt");
//
//		DataOutputStream dos = new DataOutputStream(fout);
//
//		dos.writeBytes("Anmol Sahu is a great developer");
//		dos.flush();
//		dos.close();

		//reading that data from data2
		FileInputStream fin = new FileInputStream("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data2.txt");

		DataInputStream dis = new DataInputStream(fin);

		int count = fin.available();
		
		byte[] ba = new byte[count];
		
		//read it 
		dis.read(ba);
		
		for(byte b:ba) {
			System.out.print((char)b);
		}
		
		fin.close();
		dis.close();

	}

}
