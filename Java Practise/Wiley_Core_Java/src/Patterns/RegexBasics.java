package Patterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
	public static void main(String[] args) {
//		. , \w, \W, \s, \S, \d, \D
		
//		String re = "..";
		//String re = "\\w\\w\\w\\W."; //(a-z A-Z, 0-9,_)
		//String re = "\\S\\s";
		String re = "\\d\\d\\D";
		String text = "99@";
		
		Pattern pattern = Pattern.compile(re);
		
		Matcher mt = pattern.matcher(text);
		
		 boolean res = mt.matches();
//		 System.out.println(res);   //true
		 
		 
		 Pattern p = Pattern.compile(".xx.");
		 Matcher m = p.matcher("Axxb");
//		System.out.println("matched or not : "+m.matches());//true
		
		System.out.println(checkMatch("[abc]","wabc")); //false w is not there in pattern
		System.out.println(checkMatch("[abc]","c")); //true 
		System.out.println(checkMatch("[abc]","aabbccc"));//false more than one time

		
		
	}
	
	static boolean  checkMatch(String patternType,String text) {
		Pattern pattern = Pattern.compile(patternType);
		
		Matcher mt = pattern.matcher(text);
		return mt.matches();
	}
}