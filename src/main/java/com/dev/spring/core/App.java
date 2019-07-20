package com.dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.spring.core.beans.PersonXML;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//       ApplicationContext ctx = 
//    		   new AnnotationConfigApplicationContext(PersonConfig.class);
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("/config/PersonConfig.xml");
    	PersonXML p = ctx.getBean(PersonXML.class,"person");
       System.out.println(p.getName());
       p.getJob().doJob();
       
       
       
       
       
    }
}
