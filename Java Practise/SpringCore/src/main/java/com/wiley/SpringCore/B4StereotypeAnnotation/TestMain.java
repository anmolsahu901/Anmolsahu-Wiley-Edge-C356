package com.wiley.SpringCore.B4StereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
   			 new ClassPathXmlApplicationContext("com/wiley/SpringCore/B4StereotypeAnnotation/stereoconfig.xml");
		
//		Student st = context.getBean("student",Student.class); //default name is camelcase name of class
		Student st = context.getBean("obj",Student.class); // mentioning name of object "obj"

		System.out.println(st);
		System.out.println(st.getAddress());
	}

}
