package com.dev.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dev.spring.core.beans.User;
import com.dev.spring.core.config.UserConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = 
        		new AnnotationConfigApplicationContext(UserConfiguration.class);
        User u = ctx.getBean(User.class,"user");
        System.out.println(u);
        
    }
}
