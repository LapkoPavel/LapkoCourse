package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OnAir 
{
	public static void main (String[] args) throws Exception
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
			"com/springinaction/springidol/spring-idol.xml");
		Performer performer = (Performer) ctx.getBean("stevie");
		performer.perform();
		
	}
}
