package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OnAir 
{
	private static ApplicationContext ctx;

	public static void main (String [] args) throws PerformanceException
	{
		ctx = new ClassPathXmlApplicationContext
				("com/springinaction/springidol/spring-idol2.xml");
		Performer performer = (Performer) ctx.getBean("duke");
		performer.perform();
		
	}
}
