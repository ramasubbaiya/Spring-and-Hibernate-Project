package com.rama.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach() {

	}

	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on Cricket practice";
	}

	@Override
	public String getDailyFortune() {
		return "Just dont do it "+ fortuneService.getFortune() ;
	}
	
	// add an init method
	public void doAnInit() {
		System.out.println("CricketCoach: inside Init method");
	}
	
	//add a destroy method
	public void doADestroy() {
		System.out.println("CricketCoach: inside Destroy method");
	}
}
