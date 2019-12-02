package com.luv2code.springdemo;

public class GaaCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;

	public GaaCoach() {
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Practice passing";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
