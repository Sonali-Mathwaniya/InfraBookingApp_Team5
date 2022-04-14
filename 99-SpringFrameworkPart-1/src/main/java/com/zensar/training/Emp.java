package com.zensar.training;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	@Autowired
	private Address address;

	 
	
	public Emp() {
		super();
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
	
	
	

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

 
	
	
	
	
}
