package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class); 
		Coach alphaCoach = context.getBean("myCoach",Coach.class); 
		
		//chech if they are same bean
		boolean result = (theCoach==alphaCoach);
		
		//print out the results
		System.out.println("\n Pointing to same object: " + result);
		System.out.println("\n Memory location for the coach " + theCoach);
		System.out.println("\n Memory location for the alphacoach " + alphaCoach + "\n");
		
		context.close();


	}

}
