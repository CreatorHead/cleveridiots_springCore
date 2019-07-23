package com.dev.spring.core.beans;

import org.springframework.beans.factory.DisposableBean;

public class PersonXML implements DisposableBean {
	private String name;
	private Job job;
	
	public void init(){
		System.out.println("Init Phase");
	}
	
	public void bye(){
		System.out.println("bye bye (destroy-method))");
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
	@Override
	public void destroy() throws Exception {
		System.out.println("bye bye world (destroy())");
	}
}
