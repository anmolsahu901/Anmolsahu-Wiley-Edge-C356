package Wiley_Core_Java;

public class A1CreateClass implements Cloneable {

	int a =10;
	static int b = 20;
	
	A1CreateClass(){
		int k =10;
	}
	
	public void add() {
		System.out.println(a);
	}
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		
		//  create obj using new keyword
		A1CreateClass obj = new A1CreateClass();
		System.out.println(obj);
//		
//		obj.add();
//		
//		System.out.println(b);
		
	//  create obj using new instance
		try {
			Class c = Class.forName("Wiley_Core_Java.A1CreateClass");
			A1CreateClass obj1 = (A1CreateClass) c.newInstance();
			
			System.out.println(obj1);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	// create object using clone 	
		
		A1CreateClass objClone = (A1CreateClass) obj.clone();
				
		objClone.add();
		
		System.out.println(objClone);
		
		
	}

}







