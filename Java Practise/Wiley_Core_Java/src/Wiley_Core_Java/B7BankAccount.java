package Wiley_Core_Java;

public class B7BankAccount {

	private int accountNumber;
	private double balance;
	private String customername;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance +=amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("insufficient funds.");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
