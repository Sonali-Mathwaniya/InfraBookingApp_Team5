package com.zensar.training.ref;

public class A {

	private int x;
	private B ojb;
	
	
	
	public A() {
		super();
	}



	public A(int x, B ojb) {
		super();
		this.x = x;
		this.ojb = ojb;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public B getOjb() {
		return ojb;
	}



	public void setOjb(B ojb) {
		this.ojb = ojb;
	}



	@Override
	public String toString() {
		return "A [x=" + x + ", ojb=" + ojb + "]";
	}
	
	
	
	
	
	
	
	
}
