package Greedy;

import java.util.Scanner;

public class Array_BubbleSort {
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
		//worst case time complexity = O(n^2)
		//swapping a[j] & a[j+1] if a[j] > a[j+1] 
		//largest element ko sabse peeche move karte jao 
		//bubble: back : largest element ko back mein move kardo
//		for(int i =0 ;i<n-1;i++)
//		{
//			for(int j = 0 ;j<n-1-i;j++)
//			{
//				if(a[j]> a[j+1]) {
//					int temp = a[j];
//					a[j] =a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
		
//		for(int i:a)
//		System.out.print(i+" ");
		
		sort(a);
	}
	
	public static void sort(int []arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i:arr)
			System.out.print(i+" ");
	}
}








