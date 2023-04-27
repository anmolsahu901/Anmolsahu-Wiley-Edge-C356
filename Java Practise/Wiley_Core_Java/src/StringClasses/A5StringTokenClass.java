package StringClasses;

import java.util.StringTokenizer;

public class A5StringTokenClass {

	public static void main(String[] args) {
		
		String input = "we,  love,  java,programming";
		StringTokenizer st = new StringTokenizer(input,",");

		System.out.println(st.countTokens());
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken().trim());
		}
		
//		System.out.println(st.nextToken());
		
	}

}
