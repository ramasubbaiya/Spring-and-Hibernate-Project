package com.rama.springdemo;

import org.springframework.stereotype.Component;

// Added a component instead of declaring a bean in the ApplicationContext 
// @Component("tennisCoach")
// If its @Component the TennisCoach (class name) -> tennisCoach (default bean id)
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice tennis with tennis ball";
	}

}
