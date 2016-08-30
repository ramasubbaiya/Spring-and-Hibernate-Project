package com.rama.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConigDemoApp {
			
	public static void main(String[] args) {
		// read spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SwimJavaConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods... has the props values injected
		System.out.println("Name: " + theCoach.getName());
		System.out.println("Email: " + theCoach.getEmail());
		
		// close the context
		context.close();		
	}
}
