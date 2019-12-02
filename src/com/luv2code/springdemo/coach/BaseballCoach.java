package com.luv2code.springdemo.coach;

import com.luv2code.springdemo.fortune.FortuneService;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fs) {
		fortuneService = fs;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "spend 30 minutes practicing swings";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
