package com.zensar.training.collection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Example {

	@Autowired
	private Subject subject;

	
	 
	public Example(Subject subject) {
		super();
		this.subject = subject;
	}


 
	public Example() {
		super();
	}



	public Subject getSubject() {
		return subject;
	}



	public void setSubject(Subject subject) {
		this.subject = subject;
	}



	@PostConstruct
	public void come() 
	{
		
		
		System.out.println("init method");
	}
	
	@PreDestroy
	public void go() 
	{
		
		
		System.out.println("destroy method");
		
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	} 	
	
	
	
	
}
