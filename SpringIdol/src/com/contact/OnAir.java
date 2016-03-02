package com.contact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Performer;

public class OnAir 
{
	public static void main(String [] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("com/contact/contact.xml");
		PhoneNumber performer = (PhoneNumber) ctx.getBean("infoPhone");
	
		
	}

}
