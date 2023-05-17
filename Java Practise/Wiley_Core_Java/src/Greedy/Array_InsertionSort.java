package Greedy;

import java.util.Scanner;

public class Array_InsertionSort {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the n ");
		int n = obj.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = obj.nextInt();
		}
		
		
		
		//best case time complexity = O(n)
		// Average case time complexity = O(n^2)
		// worst case time complexity = O(n^2)
		//array 2 hisso me divide so jaygi sorted and unsorted ab karna ye h ki
		//unsorted array se ek ek element nikalo aur use sorted array me sahi jagah
		//add kardo ...shuru mein sorted array mein bss ek element hoga 
		//check in copy for dry run with explanation
		
		for(int i = 1;i<n;i++)
		{
			int current = a[i];
			int j = i-1;
			while(j>=0 && current < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = current;
		}
		
		for(int i:a)
			System.out.print(i+" ");

	}

}
