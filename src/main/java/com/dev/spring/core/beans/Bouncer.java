package com.dev.spring.core.beans;

public class Bouncer implements Job{

	@Override
	public void doJob() {
		System.out.println("Secure Secure Secure...");
	}

}
