package com.zensar.training.lifecycle;

public class Samosa {

	private int price;

	 
	public Samosa() {
		super();
	}

 
	public Samosa(int price) {
		super();
		this.price = price;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		
		System.out.println("Setting price");
		this.price = price;
	}


	
	public void come() 
	{
		
		System.out.println("come method init method");
	}
	
	
	
	public void go() 
	{
		System.out.println("go method destroy method");
	}
	
	
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	 
}
