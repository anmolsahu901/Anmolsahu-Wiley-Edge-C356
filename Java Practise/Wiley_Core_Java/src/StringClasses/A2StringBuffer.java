package StringClasses;

public class A2StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Wiley");
		StringBuffer sb1 = new StringBuffer("Wiley Edge");
		StringBuffer sb2= new StringBuffer("Wiley Edge");

		String ss = "Wiley Edge";
		
		System.out.println(sb.equals(sb1));
		System.out.println(ss.equals(sb2));

		System.out.println(ss.equals(sb1.toString()));
		
//		sb.append(" program");
		System.out.println(sb);
		
		sb.insert(5, "Anmol");
		System.out.println(sb);
		
		System.out.println("Delete :"+sb.delete(0, 5));
		System.out.println("Reverse :"+sb.reverse());
		
		

	}

}
