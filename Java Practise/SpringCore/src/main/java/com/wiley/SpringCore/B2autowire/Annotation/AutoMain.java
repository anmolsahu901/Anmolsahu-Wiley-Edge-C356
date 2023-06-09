package com.wiley.SpringCore.B2autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/SpringCore/B2autowire/Annotation/config.xml");
		
		Emp emp1 = context.getBean("emp1",Emp.class);
				
		System.out.println(emp1);
		
		

	}

}
