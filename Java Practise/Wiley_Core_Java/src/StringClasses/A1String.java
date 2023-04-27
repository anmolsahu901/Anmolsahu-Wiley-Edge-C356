package StringClasses;

public class A1String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Anmol";
		String s2 = "Anmol";
		
		String s3 = new String("Anmol");
		String s4 = new String("Anmol");

		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		System.out.println(s3==s4);
		
		String str = "I am a java developer";
		String str1 = "Pyhton";
		
		System.out.println(str.charAt(0));
		System.out.println(str.concat(s1));
		
	}

}
