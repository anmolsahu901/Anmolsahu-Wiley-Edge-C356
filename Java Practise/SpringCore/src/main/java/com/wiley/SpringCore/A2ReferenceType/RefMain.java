package com.wiley.SpringCore.A2ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

	public static void main(String[] args) {
		ApplicationContext context =
   			 new ClassPathXmlApplicationContext("com/wiley/SpringCoreReferenceType/config.xml");
   
		WileyA wa  = (WileyA) context.getBean("waref");
				
		System.out.println(wa.getObj().getCount());
		
		Student s= (Student) context.getBean("wileystudent");
		
		System.out.println(s.getLocation().getAddress());
	}

}




















