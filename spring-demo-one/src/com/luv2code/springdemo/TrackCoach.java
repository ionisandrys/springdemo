package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just do it: "+fortuneService.getFortune();
	}

	// add init method
	public void init(){
		System.out.println("Inside Init method");
	}
	
	// add destroy method
	public void destroy(){
		System.out.println("Destroy method");
	}
	
	
}
