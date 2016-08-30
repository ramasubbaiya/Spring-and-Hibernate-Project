package com.rama.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.name}")
	public String name;
	
	@Value("${foo.email}")
	public String email;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "I am swimming for 30minutes daily to beat Philip";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
