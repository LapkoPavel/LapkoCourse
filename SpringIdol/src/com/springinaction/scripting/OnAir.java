package com.springinaction.scripting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class OnAir {
	public static void main(String[] args) throws Exception
	{
	ApplicationContext ctx = new ClassPathXmlApplicationContext
			("com/springinaction/scripting/coconut.xml");
	Coconut performer = (Coconut) ctx.getBean("coconut");
	performer.drinkThemBothUp();
	}
}
