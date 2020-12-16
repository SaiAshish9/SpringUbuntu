package com.springannotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("silly")
@Component
public class TennisCoach implements Coach {
	
//	field injection
	
	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("default");
	}
	
//	constructor injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
       return "daily";	
	}
	
//  setter injection	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
//	method injection
//	@Autowired
//	public void methodInjection(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}

// TennisCoach -> tennisCoach default bean id