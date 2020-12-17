package com.springannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationAnnotations.xml");
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		boolean result = theCoach == alphaCoach ;
		System.out.println(result + "\n" + theCoach + "\n" + alphaCoach );
		context.close();
	}
}
