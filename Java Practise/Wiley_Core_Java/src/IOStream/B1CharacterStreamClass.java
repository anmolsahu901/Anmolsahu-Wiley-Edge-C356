package IOStream;

import java.io.*;

public class B1CharacterStreamClass {

	public static void main(String[] args) throws IOException {
		//Write 
//		Writer out = new OutputStreamWriter(System.out);
//		
//		Writer fw = new FileWriter("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data5.txt");
//
//	    BufferedWriter bw = new BufferedWriter(fw);
//		
//		bw.write("I like programming message from B1CharacterStreamClass ");	
//		
//		bw.flush();
//		bw.close();
//		fw.close();
		
		//Read
		Reader read = new InputStreamReader(System.in);
		
		Reader fr = new FileReader("D:\\practise\\Wiley Edge Training\\Java Practise\\Wiley_Core_Java\\data\\data5.txt");

	    BufferedReader br = new BufferedReader(fr);
		
//		br.read("I like programming message from B1CharacterStreamClass ");	
		
	    System.out.println(br.readLine());
	    
//		br.flush();
		br.close();
		fr.close();
	}

}
