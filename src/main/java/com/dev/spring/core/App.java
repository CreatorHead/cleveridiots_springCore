package com.dev.spring.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dev.spring.core.config.PersonConfig;

public class App 
{
	public static void main( String[] args )
	{
				AnnotationConfigApplicationContext ctx = 
				    		   new AnnotationConfigApplicationContext(PersonConfig.class);
//		ClassPathXmlApplicationContext ctx = 
//				new ClassPathXmlApplicationContext("/config/PersonConfig.xml");
		
		ctx.close();
	}
}
