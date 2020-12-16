package com.springannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("silly")
@Component
public class TennisCoach implements Coach {
	private FortuneService fortuneService;
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
       return "daily";	
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

// TennisCoach -> tennisCoach default bean id