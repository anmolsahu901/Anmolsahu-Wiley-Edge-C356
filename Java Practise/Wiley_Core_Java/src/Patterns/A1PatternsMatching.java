package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A1PatternsMatching {

	public static void main(String[] args) {
		String input = "The key to LEARN programming is consistent practise and learn";
		Pattern pattern = Pattern.compile("learn",Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = pattern.matcher(input);
		System.out.println(matcher.find());
		System.out.println(matcher.matches());
		/*
		//finds only once
		if(matcher.find())
		{
			int start = matcher.start();
			int end = matcher.end();
			System.out.println("match found from index:"+start+" to "+ (end-1) );
			
		}
		
		String pat = "learn";
		int idx = input.indexOf(pat);
		System.out.println(idx);
		
		if(idx != -1) {
			System.out.println(idx);
		}
		*/
		
		
		
		
		
		
		
	}
	

}
