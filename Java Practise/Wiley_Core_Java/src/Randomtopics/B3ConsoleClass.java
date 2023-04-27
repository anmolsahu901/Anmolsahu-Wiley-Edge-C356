package Randomtopics;

import java.io.*;
//read and write in console
public class B3ConsoleClass {

	public static void main(String[] args) {
		Console console = System.console();
		
		if(console == null)
		{
			System.out.println("console not available");
			System.exit(0);
		}
		//get input from user 
		String name = console.readLine("What is your name");
	    char[]password = console.readPassword("Enter your password");
	
	    
	    console.printf("Hello, %s\n",name);
	    console.printf("Your password is : ,%s\n", new String(password));
	    
	}

}
