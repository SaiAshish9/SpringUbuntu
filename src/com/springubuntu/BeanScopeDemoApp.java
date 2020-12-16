package com.springubuntu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
   public static void main(String[] args) {
	  
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	   Coach theCoach = context.getBean("myCoach",Coach.class);
	   Coach alphaCoach = context.getBean("myCoach",Coach.class);
//	    default -> Singleton
	   boolean result = theCoach == alphaCoach;
	   System.out.println(result + "\n" + theCoach + "\n" + alphaCoach );
	   context.close();
	   
	   
	   
   }
}
