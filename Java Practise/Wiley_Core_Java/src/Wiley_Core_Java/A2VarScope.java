package Wiley_Core_Java;

public class A2VarScope {
	
	int ins = 20;
	int val= 18;
	int val1 = 12;
	int loc = 25;
	static String name = "Anmol";
	
	public void sum() {
		int val = 10;
		int val1 = 25;
		
		System.out.println("Sum Methods : "+(this.val + this.val1));
	}
	
	
	public static void main(String[] args) {
		
		A2VarScope vso = new A2VarScope();
		
		int loc= 10;
		
//		System.out.println("Local Vairable : "+this.loc); can't use this in static block

		System.out.println("Local Vairable : "+loc);
		
		System.out.println("Instance Vairable : "+vso.ins);
		
		System.out.println("Static Variable : "+ name);
		
		vso.sum();
	}
}
