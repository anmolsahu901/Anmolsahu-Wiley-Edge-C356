package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A1StreamsClass {
	public static void main(String[] args) {
		/*int []a = {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				sum+=a[i];
		}
		System.out.println(sum);

		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int total = Arrays.stream(arr).filter(n->n%2==0);
		 */
		// advantages of stream : readable,flexibility,parallelism

		//create Streams
		// 1st approach : list to stream
		//		List<String> list = Arrays.asList("Java","Python","Angular");
		//		
		//		Stream<String> mystream = list.stream();
		//		
		//		//2nd approach array to stream
		//		String []arr = {"Java","Python","Angular"};
		//		Stream<String> myStreamArr = Arrays.stream(arr);
		//		
		//		//3rd Integer stream  
		//		Stream<Integer> integerStream = Stream.of(1,2,3);
		//		
		//		// stream of integer from 0 to 100
		//		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(100);
		//		
		//		//
		//		Stream<String> limitString = Stream.generate(()->"Wiley").limit(5);
		//		
		//		Stream<Integer> limitRandom = Stream.generate(()->(int)Math.random()*100).limit(5);

		List<Integer> list = Arrays.asList(1,2,34,44,56,3,3,5,9,13,15,4,456,6,7,7,8,9,5,4,3,23);
//		List<Integer> filteredData = 
//				list.stream()
//				.filter(x-> x%2==0)
//				.collect(Collectors.toList());
//		System.out.println(filteredData);
//
//
//		List<Integer> mappedList = 
//				filteredData.stream()
//				.map(n->n/2)
//				.collect(Collectors.toList());
//		System.out.println(mappedList);

		List<Integer> filteredData = 
				list.stream()
				.filter(x-> x%2==0) //give only even value
				.map(n->n/2) // divide even value by 2
				.distinct() // print only distinct
				.sorted((a,b)->(b-a))  // sort the data can use comparator also
				.limit(3) // top 3 data only
				.collect(Collectors.toList());

		System.out.println(filteredData);
		
		
		
		
		
	}
}











