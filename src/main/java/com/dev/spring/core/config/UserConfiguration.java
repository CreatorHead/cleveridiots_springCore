package com.dev.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dev.spring.core.beans.User;

@Configuration
public class UserConfiguration {
	
	@Bean(name="user")
	public User getUser(){
		User u = new User();
		u.setFirstName("Abc");
		u.setLastName("xyz");
		u.setUserId(1);
		u.setPassword("root");
		return u;
	}
}
