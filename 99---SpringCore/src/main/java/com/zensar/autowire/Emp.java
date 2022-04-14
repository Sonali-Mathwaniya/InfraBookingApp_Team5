package com.zensar.autowire;

public class Emp {

	private Address address;

	 
	public Emp() {
		super();
		
		
		System.out.println("inside defalut constructor");
	}

 
	public Emp(Address address) {
		super();
	
		this.address = address;
	
		System.out.println("inside pera constructor");
	
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
	
	
}
