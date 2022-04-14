package com.zensar.training.ci;

public class Addition {

	
	private int a;
	private int b;
	
	
	
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}




	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
	}
	
	
	public void dosum() 
	{
		
		System.out.println("sum is : " +(this.a+this.b));
	}




	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	 
	
	
}
