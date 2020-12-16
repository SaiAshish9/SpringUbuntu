package com.springubuntu;

public class BaseballCoach implements Coach  {
	
	private  FortuneService fortuneService;
	public BaseballCoach(FortuneService theFortuneService ) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "baseball";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
