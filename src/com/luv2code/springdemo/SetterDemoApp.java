package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve a bean from spring container
		GaaCoach theCoach = context.getBean("myGAACoach", GaaCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune() );
		
		System.out.println("Coach address: " + theCoach.getEmailAddress());
		System.out.println("Team name: " + theCoach.getTeam());
		
		theCoach = context.getBean("myPropertiesCoach", GaaCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		System.out.println(theCoach.getDailyFortune() );
		
		System.out.println("Coach address: " + theCoach.getEmailAddress());
		System.out.println("Team name: " + theCoach.getTeam());
		
		//close the context.
		context.close();

	}

}
