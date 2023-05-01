package Exceptions;

class AgeNotValid extends Exception{

	public AgeNotValid(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "this age is not valid";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "age is not applicable";
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}


}

public class A4CustomException {

	public static void getAge(int age)  {
		if(age>18) {
			try {
				throw new AgeNotValid("Age not valid");				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		else
		{
			System.out.println("Age valid");
		}
	}

	public static void main(String[] args)  {
		getAge(20);
	}

}
