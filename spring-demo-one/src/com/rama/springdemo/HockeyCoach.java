package com.rama.springdemo;

public class HockeyCoach implements Coach{

	private FortuneService fortuneService;
	
	public HockeyCoach() {
		System.out.println("HockeyCoach: I'm in the no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("HockeyCoach: I'm in the setter method "+fortuneService);
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "I'm having Hockey training";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
