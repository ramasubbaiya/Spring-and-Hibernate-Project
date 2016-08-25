package com.rama.springdemo;

public class HockeyCoach implements Coach{

	private FortuneService fortuneService;
	private String team;
	private int noOfMembers;
	
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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("HockeyCoach: I'm in the setter method : Team");
		this.team = team;
	}

	public int getNoOfMembers() {
		return noOfMembers;
	}

	public void setNoOfMembers(int noOfMembers) {
		System.out.println("HockeyCoach: I'm in the setter method : No of Members");
		this.noOfMembers = noOfMembers;
	}

}
