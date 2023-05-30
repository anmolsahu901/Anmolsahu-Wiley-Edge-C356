package com.wiley.SpringCore.A1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =
    			 new ClassPathXmlApplicationContext(new String[] {"config.xml"});
    
    	Student s = (Student) context.getBean("wileystudent6");
    	System.out.println(s);
    	
    	Student wst1 = (Student) context.getBean("wileystudent1");
   
//    	System.out.println(wst1.toString());
    	
    	Student wst3 = (Student) context.getBean("wileystudent3");
   
//    	System.out.println(wst3.toString());
    	
    	Student wst2 = (Student) context.getBean("wileystudent2");
    	   
//    	System.out.println(wst2.toString());
    	
    	
    	Studentinfo wst4 = (Studentinfo) context.getBean("wileystudent4");
 	   
//    	System.out.println(wst4.toString());
    }
}
