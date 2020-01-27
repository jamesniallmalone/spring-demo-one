package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.fortune.FortuneService;

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
	
	//add an init method
	public void doMyStartUpStuff() {
		System.out.println("Trackcoach: Inside method doMyStartUpStuff");
	}
	
	//add a destroy method
	public void doMyFinishUpStuff() {
		System.out.println("Trackcoach: Inside method doMyFinishUpStuff");
	}
}
