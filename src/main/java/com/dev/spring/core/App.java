package com.dev.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dev.spring.core.beans.Job;
import com.dev.spring.core.beans.Person;
import com.dev.spring.core.config.PersonConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = 
    		   new AnnotationConfigApplicationContext(PersonConfig.class);
       Person p = ctx.getBean(Person.class,"person");
       System.out.println(p.getName());
       p.getJob().doJob();
       
       
       
       
       
    }
}
