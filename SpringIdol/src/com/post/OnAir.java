package com.post;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.contact.PhoneNumber;

public class OnAir 
{
	public static void main(String[] args)
	{
	ApplicationContext ctx = new ClassPathXmlApplicationContext
			("com/post/post.xml");
	Rabbit performer = (Rabbit) ctx.getBean("bugs");
	System.out.println(performer.description);
	
	}

}
