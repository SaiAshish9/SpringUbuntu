package com.springubuntu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
   public static void main(String[] args) {
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
	   Coach theCoach = context.getBean("myCoach",Coach.class);
//	    default -> Singleton	   
	   System.out.println(theCoach.getDailyWorkout());
	   context.close();
   }
}
