package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String []a = {"ab","aab","abb","abab","abaaaba"};
//		
//		List<Integer>ar =  minimalOperations(Arrays.asList(a));
//		
//		for(int i:ar)
//		{
//			System.out.println(i);
//		}
		
		int n =2;
		int a[] = {12,9};
		System.out.println(getMaxOrSum1(a,1));
	}
	
	public static List<Integer> minimalOperations(List<String> words) {
	    ArrayList<Integer> result = new ArrayList<>();;
	    
	    for (int i = 0; i < words.size(); i++) {
	        String word = words.get(i);
	        int count = 0;
	        char[] chars = word.toCharArray();
	        
	        for (int j = 1; j < chars.length; j++) {
	            if (chars[j] == chars[j-1]) {
	                chars[j] = (char) (chars[j] + 97);
	                count++;
	            }
	        }
	        
	        result.add(count);
	    }
	    
	    return result;
	}

	public static long getMaxOrSum(int[] arr, int k) {
        int n = arr.length;
        long ans = 0;
        for (int bit = 30; bit >= 0; bit--) {
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    cnt++;
                }
            }
            if (cnt <= k) {
                for (int i = 0; i < n; i++) {
                    ans |= arr[i];
                }
                break;
            }
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if ((arr[i] & (1 << bit)) != 0) {
                    sum += (1L << bit) * (n - cnt);
                    arr[i] -= (1 << bit);
                } else {
                    sum += arr[i];
                }
            }
            k--;
            ans = Math.max(ans, sum);
        }
        return ans;
    }
	
	 public static long getMaxOrSum1(List<Integer> arr, int k) {
	        int n = arr.size();
	        long maxOrSum = 0;
	        for (int i = 0; i < n; i++) {
	            long orSum = 0;
	            
	            Integer[] temp = new Integer[arr.size()];
	            temp = arr.toArray(temp);
	            
	            for (int j = 0; j < k; j++) {
	                temp[i] *= 2;
	            }
	            for (int num : temp) {
	                orSum |= num;
	            }
	            maxOrSum = Math.max(maxOrSum, orSum);
	        }
	        return maxOrSum;
	    }
}
