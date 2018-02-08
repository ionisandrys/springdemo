package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring config. file - create a spring container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = (Coach)context.getBean("myCoach"); // Coach is name of interface for implementation
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call our new method for fortunes
		
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();
	}

}
