package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.fortune.FortuneService;

public class SwimmingCoach implements Coach {
	
	private FortuneService fortuneService;

	public SwimmingCoach(FortuneService fs) {
		fortuneService = fs;
	}

	@Override
	public String getDailyWorkOut() {
		return "Swim 1km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
