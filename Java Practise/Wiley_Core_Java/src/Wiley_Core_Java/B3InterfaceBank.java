package Wiley_Core_Java;

interface Bank{
	void account();
}

interface ATM extends Bank{
	void insertCard();
	void selectOption();
	void enterPassword();
	
	void account();
}

interface AA{
	void m();
}

abstract class NewATM implements ATM,AA{

	@Override
	public void account() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	
	
}

public class B3InterfaceBank extends NewATM{

	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Insert card");
	}

	public void selectOption() {
		// TODO Auto-generated method stub
		System.out.println("Select option");
	}

	public void enterPassword() {
		// TODO Auto-generated method stub
		System.out.println("Enter the password");;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
