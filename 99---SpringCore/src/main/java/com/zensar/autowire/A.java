package com.zensar.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class A {

	private int rollno;
	
	@Autowired
	private B b;

	
	
	
	public A() {
		super();
	}




	public A(int rollno, B b) {
		super();
		this.rollno = rollno;
		this.b = b;
	}




	public int getRollno() {
		return rollno;
	}




	public void setRollno(int rollno) {
		this.rollno = rollno;
	}




	public B getB() {
		return b;
	}




	public void setB(B b) {
		this.b = b;
	}




	@Override
	public String toString() {
		return "A [rollno=" + rollno + ", b=" + b + "]";
	}
	
	
	 
	
}
