package Greedy;

public class Array_QuickSort {

//	time complexity :
//		worst : O(n^2) (when array is already sorted)
//		best/average : O(nlogn)
//	it is preferred more than Merge sort in cases where storage is less
//	merge sort is preffered when there is no storage issue 
	
	
	
	public static void main(String[] args) {
		int a[] = {9,14,21,1,5,7,8};
		
		quickSort(a,0,a.length-1);
		System.out.println("\n Resultant array :");
		for(int n:a) {
			System.out.print(n+" ");
		}
	}

	 static void quickSort(int[] a, int low, int high) {
		 if(low<high) {
		 int pivotIdx = partition(a,low,high);
		
		quickSort(a,low,pivotIdx-1);
		quickSort(a,pivotIdx+1,high);
	 }
		
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low ;
		
		for(int j = low ;j<high;j++) {
			if(a[j]<pivot) {
				int temp = a[i];
				a[i] = a[j];
				a[j]= temp;
				i++;
			}
			System.out.println();
			for(int n:a) {
				System.out.print(n+" ");
			}
			
		}
		
		int temp = a[i];
		a[i] = pivot;
		a[high] = temp;
		
		return i;
	}

}






