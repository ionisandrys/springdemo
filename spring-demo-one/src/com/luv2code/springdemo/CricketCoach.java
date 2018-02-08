package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	// create fields for emailAdress and team
	private String emailAddress;
	private String team;
	
	// create no arg constructor
	
	public CricketCoach(){
		System.out.println("CricketCoach: inside no arg constr.");
	}
	
	// setter method for inj.
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method.");
		this.fortuneService = fortuneService;
	}


	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: email.");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: team.");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
