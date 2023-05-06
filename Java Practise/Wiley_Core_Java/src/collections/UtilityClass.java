package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UtilityClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {99,56,4,23,6,7,8,4,2,1,5,68,9};
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(89);
		list.add(8);
		list.add(88);
		list.add(7);
		list.add(27);
		Collections.sort(list);
		System.out.println(list);
	}

}
