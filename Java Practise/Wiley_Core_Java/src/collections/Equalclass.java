package collections;



public class Equalclass {

	public static void main(String[] args) {
		
		// when use string class it checks memory address
//		String s1 = new String("Wiley");
//		String s2 = new String("Wiley");

//		String s1 = "Wiley";
//		String s2 = "Wiley";
//		
//		
//		if(s1 == s2) {
//			System.out.println("The string are equal");
//		}
//		else
//		{
//			System.out.println("String are not equal");
//		}
		
		Dog myDog = new Dog();
		Dog yourDog = new Dog();
		
		if(myDog.equals(yourDog)) {
			System.out.println("The dogs are equal");
			
		}
		else {
			System.out.println("The dogs are not equal");

		}
		
	
	}

}
