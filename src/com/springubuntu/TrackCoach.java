package com.springubuntu;

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
		return fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("Track");
	}
	
	public void doMyCleanupStuff() {
		System.out.println("Track C ");
	}
	

}










