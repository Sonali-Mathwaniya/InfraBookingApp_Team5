package com.zensar.training.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Square {

	
	private int size;

	 
	
	public Square() {
		super();
	}

 
	public Square(int size) {
		super();
		this.size = size;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}

	@PostConstruct
	public void come() 
	{
		
		System.out.println("come method in square class init method");
	}
	
	
	@PreDestroy
	public void go() 
	{
		System.out.println("go method in square class destroy method");
	}
	
	

	@Override
	public String toString() {
		return "Square [size=" + size + "]";
	}
	
	 
	
}
