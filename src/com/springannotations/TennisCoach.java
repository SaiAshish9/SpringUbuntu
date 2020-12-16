package com.springannotations;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("silly")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
//	field injection
	
	@Autowired
	@Qualifier("happyFortuneService")
//	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("default");
	}
	
	
	@PostConstruct
	public void start() {
		System.out.println("start");
	}
	
//	after constructor & injection of d's
	
	@PreDestroy
	public void close() {
		System.out.println("e");
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