package com.springannotations;

import org.springframework.stereotype.Component;

//@Component("silly")
@Component
public class TennisCoach implements Coach {
	@Override
	public String getDailyWorkout() {
       return "daily";	
	}
}

// TennisCoach -> tennisCoach default bean id