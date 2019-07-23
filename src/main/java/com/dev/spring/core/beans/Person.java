package com.dev.spring.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {
	private String name;
	private Job job;

	@PostConstruct
	public void postConstruct(){
		System.out.println("post construct...");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("pre destroy...");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
}
