package com.zensar.training;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car {

	public void drive() 
	{
		
		System.out.println("chal rhi h");
	}
	
	@PostConstruct
	public void init() 
	{
		
		System.out.println("init method");
		
	}
	
	
	@PreDestroy
	public void destroy() 
	{
		
		
		
		System.out.println("destroy  method");
		
		
		
	}
	
	
	
}
