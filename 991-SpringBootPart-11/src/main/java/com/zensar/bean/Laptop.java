package com.zensar.bean;

import org.springframework.stereotype.Component;

@Component("lapi")
public class Laptop {

	private int aid;
	private String aname;
	private String tech;
	 
	
	public Laptop() {
		super();
		System.out.println("laptop class default constructor");
		
	}
 
	public Laptop(int aid, String aname, String tech) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.tech = tech;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Laptop [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	public void compile() 
	{
		System.out.println("compiling method");
	}
	
}
