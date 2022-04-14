package com.zensar.training;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car implements Vehicle {

	@Id
	private int modelNo;
	private String name;
	
	
	
	
	
	
	
	public Car(int modelNo, String name) {
		super();
		this.modelNo = modelNo;
		this.name = name;
	}







	public int getModelNo() {
		return modelNo;
	}







	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}







	public String getName() {
		return name;
	}







	public void setName(String name) {
		this.name = name;
	}







	@Override
	public String toString() {
		return "Car [modelNo=" + modelNo + ", name=" + name + "]";
	}







	@Override
	public void drive() {
 
	System.out.print("drive method");
	
	
	}
	
	
	
	
	
}
 