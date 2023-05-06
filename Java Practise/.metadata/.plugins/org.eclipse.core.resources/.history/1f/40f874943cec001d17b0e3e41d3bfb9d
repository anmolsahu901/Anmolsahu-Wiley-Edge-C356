package Assignment;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 Rupee");
		System.out.println("2 Dollar");
		System.out.println("3 Euro");
		System.out.println("4 Pound");
		
		// take input
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the currency");
		int choice = sc.nextInt();
		System.out.println("Enter t1he amount");
		double amount = sc.nextDouble();
		
		// convert the amount
		switch (choice) {
		case 1:
			Rupee_to_other(amount);
			break;
		case 2:
			Dollar_to_other(amount);
			break;
		case 3:
			Euro_to_other(amount);
			break;
		case 4:
			Pound_to_other(amount);
		default:
			System.out.println("Invalid choice");
		}

	}

	public static void Rupee_to_other(double amt) {
		System.out.println("1 Rupee = " + 0.013 + " Dollar");
		System.out.println();

		System.out.println(amt + " Rupee = " + (amt * 0.013) + " Dollar");
		System.out.println();

		System.out.println("1 Rupee = " + 0.012 + " Euro");
		System.out.println();
		System.out.println(amt + " Rupee = " + (amt * 0.012) + " Euro");
		System.out.println();

		System.out.println("1 Rupee = " + 0.0098 + " Pound");
		System.out.println();

		System.out.println(amt + " Rupee = " + (amt * 0.0098) + " Pound");

	}

	public static void Dollar_to_other(double amt) {
		System.out.println("1 Dollar = " + 79.37 + " Rupee");
		System.out.println();
		System.out.println(amt + " Dollar = " + (amt * 79.37) + " Rupee");
		System.out.println();

		System.out.println("1 Dollar= " + 0.98 + " Euro");
		System.out.println();

		System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
		System.out.println();

		System.out.println("1 Dollar = " + 0.80 + " Pound");
		System.out.println();

		System.out.println(amt + " Dollar = " + (amt * 0.80) + " Pound");
	}

	public static void Euro_to_other(double amt) {
		System.out.println("1 Euro = " + 80.85 + " Rupee");
		System.out.println();
		System.out.println(amt + " Euro = " + (amt * 80.85) + " Rupee");
		System.out.println();

		System.out.println("1 Euro = " + 1.02 + " Dollar");
		System.out.println();

		System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
		System.out.println();

		System.out.println("1 Euro = " + 0.88 + " Pound");
		System.out.println();

		System.out.println(amt + " Euro = " + (amt * 0.88) + " Pound");
		
	}
	public static void Pound_to_other(double amt) {
	
		System.out.println("1 Pound = " + 102.01 + " Rupee");
		System.out.println();
		System.out.println(amt + " Pound = " + (amt * 102.01) + " Rupee");
		System.out.println();

		System.out.println("1 Pound = " + 1.25 + " Dollar");
		System.out.println();

		System.out.println(amt + " Pound = " + (amt * 1.25) + " Dollar");
		System.out.println();

		System.out.println("1 Pound = " + 1.25 + " Euro");
		System.out.println();

		System.out.println(amt + " Pound = " + (amt * 1.135) + " Euro");
		
	}

}
