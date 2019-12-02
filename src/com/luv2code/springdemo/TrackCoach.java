package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(FortuneService fs) {
		fortuneService = fs;
	}

	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkOut() {
		return "Run 5k";
	}
 
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
