package com.rama.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rama/springdemo/applicationContext.xml");
		
		// retrieve bean from spring container
		HockeyCoach hockey = context.getBean("hockeyCoach", HockeyCoach.class);
		
		// call methods on the bean
		System.out.println(hockey.getDailyWorkout());
		
		System.out.println(hockey.getDailyFortune());
		
		System.out.println(hockey.getTeam());
		
		System.out.println(hockey.getNoOfMembers());
		
		// close the context
		context.close();
	}
}
