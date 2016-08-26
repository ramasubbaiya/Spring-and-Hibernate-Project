package com.rama.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Added a component instead of declaring a bean in the ApplicationContext 
// @Component("tennisCoach")
// If its @Component the TennisCoach (class name) -> tennisCoach (default bean id)
@Component
public class TennisCoach implements Coach {

	/*
	 *  this is a Field - Autowire Injection
	 *  
	 *  Even the field is private the Spring will steel and 
	 *  set these values behind the scene
	 *  It uses Java technology called Reflections
	 *  
	 */
	
	@Autowired
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	/*
	 * **************************************************  
	 * this is a Constructor - Autowire Injection
	 *
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	*****************************************************/
	
	
	/*	
	 * **************************************************  
     * define a setter method
	 * this is a Setter - Autowire Injection
	 * 
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}
	
	*****************************************************/

	/*
	 @Autowired
	public void doSomethingHere(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomethingHere() method");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice tennis with tennis ball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
