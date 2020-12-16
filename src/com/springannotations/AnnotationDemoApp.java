package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationAnnotations.xml");
		Coach theCoach = context.getBean(
//				"silly"
				"tennisCoach"
				,Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();	
	}
}
