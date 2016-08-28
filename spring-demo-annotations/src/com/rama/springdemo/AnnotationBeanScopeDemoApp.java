package com.rama.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
			
	public static void main(String[] args) {
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// get the same bean from the container
		Coach theAnotherCoach = context.getBean("tennisCoach", Coach.class);
		
		// check both the beans are same
		boolean result = (theCoach == theAnotherCoach);
		
		// print out the methods
		System.out.println("\nPointing to the Same Object : " + result);
		
		System.out.println("\nMemory location for theCoach : " + theCoach);

		System.out.println("\nMemory location for theAnotherCoach : " + theAnotherCoach);
		
		// close the context
		context.close();		
	}
}
