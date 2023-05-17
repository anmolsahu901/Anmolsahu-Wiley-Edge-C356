package Greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = obj.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		int coins[] = {5,2,1};

		for(int i=0;i<coins.length;i++) 
		{
			int temp = n/coins[i];
			for(int j=0;j<temp;j++)
				list.add(coins[i]);
			n = n%coins[i];
		}

		System.out.println(list);
	}

}
