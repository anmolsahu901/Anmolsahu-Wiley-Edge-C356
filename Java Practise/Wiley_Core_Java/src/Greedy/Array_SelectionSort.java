package Greedy;

import java.util.Scanner;

public class Array_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the n ");
		int n = obj.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = obj.nextInt();
		}
		
		
		for(int i=0;i<n-1;i++)
		{
			int smallestidx = i;
			for(int j=i+1;j<n;j++)
			{
				if(a[smallestidx] > a[j])
				{
					smallestidx = j;
				}
			}
			int temp = a[i];
			a[i] = a[smallestidx];
			a[smallestidx] = temp;
			
		}
		
		
		
		
		//
		//average / selection / worst time complexity = O(n^2) = (n-1 + n-2 + n-3 + ......0)
		// 1st smallest element nikalo use 1st pos se swap karo fir
		//2nd smallest element nikalo use 2nd pos se swap karo ......
		//continue karte jao till n-1
		//selection: smallest ko first me se swap kardo 
		
//		for(int i = 0 ;i<n-1 ;i++)
//		{
//			int smallest = i;
//			for(int j=i+1;j<n;j++)
//			{
//				if(a[smallest]> a[j])
//				{
//					smallest = j;
//				}
//			}
//			int temp = a[smallest];
//			a[smallest] = a[i];
//			a[i] = temp;
//			
//		}
		
		
		for(int i:a)
			System.out.print(i+" ");
	}

}
