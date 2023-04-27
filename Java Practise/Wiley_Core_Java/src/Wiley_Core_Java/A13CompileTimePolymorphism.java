package Wiley_Core_Java;

class Calculate{
	int i,j;
	
	Calculate(){
		this.i=10;
		this.j = 20;
	}
	
	void sum(int i) {
		System.out.println( i+this.j);
	}
	
	void sum() {
		System.out.println(this.i +this.j);
	}
	
	void sum(int i,int j) {
		System.out.println(i+j);
	}
	
	void sum(float i,int j) {
		System.out.println(i+j);
	}
	
}

public class A13CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj = new Calculate();
		
		obj.sum(50);
		obj.sum(9.34f,10);
		obj.sum(1, 69);
		obj.sum();
		
	}

}
