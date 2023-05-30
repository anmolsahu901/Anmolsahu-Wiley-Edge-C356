package com.wiley.SpringCore.A4lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =
	   			 new ClassPathXmlApplicationContext("com/wiley/SpringCore/A4lifeCycle/config.xml");
	   
		

		
		Pizza p = (Pizza) context.getBean("pizza3");
		
		System.out.println(p);
		context.registerShutdownHook(); // this () is in AbstractApplicationContext
		
//		p = (Pizza) context.getBean("pizza2");
//		System.out.println(p);
		
		///////////using interface 
		Pepsi p1 = (Pepsi) context.getBean("pepsi1");		
		System.out.println(p1);
		
		////////////
		
		Samosa s1 = (Samosa) context.getBean("samosa1");
		System.out.println(s1);
		
		
		
		
	}

}
