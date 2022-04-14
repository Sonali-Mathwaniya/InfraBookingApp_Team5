package com.zensar.training.autowire;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Emp {

	
	private Address address;

	 
	
	public Emp() {
		super();
		System.out.println("Default constructor");
	
	}

	
	@Autowired
	public Emp(Address address) {
		super();
		System.out.println("Pera constructor");
		
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
	
		System.out.println("setting method");
		
		this.address = address;
	}
	
	
	 
	

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

 
	
	
	
	
}
