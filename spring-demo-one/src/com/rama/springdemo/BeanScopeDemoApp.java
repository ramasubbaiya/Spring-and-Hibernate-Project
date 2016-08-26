package com.rama.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/com/rama/springdemo/beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("theCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("theCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Pointing to the same object : " + result);
		
		System.out.println("\nMemory location for theCoach : " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach);
		
		// close the context
		context.close();
	}
}
