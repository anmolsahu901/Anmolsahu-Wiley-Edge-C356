package com.wiley.SpringCore.A3Ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
	   			 new ClassPathXmlApplicationContext("com/wiley/SpringCore/A3Ci/config.xml");
	   
		Person p = (Person) context.getBean("p1");
		
		System.out.println(p);
		
		Person p1 = (Person) context.getBean("p2");
		System.out.println(p1);
		
		Addition add = (Addition) context.getBean("Add");
		add.doSum();
	}

}
