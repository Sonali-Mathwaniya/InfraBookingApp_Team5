package com.zensar.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "singleton")
//it creates object
public class Alien {

	 private int aid;
	 private String name;
	 private String tech;

	 @Autowired
    // @Qualifier("lapi")
	 private Laptop laptop;
	 
	 
	 
	 public Alien() {
		super();
	System.out.println("aline class default constructor");
	 }





	public Alien(int aid, String name, String tech) {
		super();
		System.out.println("pera constructor");
		
		this.aid = aid;
		this.name = name;
		this.tech = tech;
	}





	public Laptop getLaptop() {
		return laptop;
	}





	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}





	public int getAid() {
		return aid;
	}





	public void setAid(int aid) {
		this.aid = aid;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getTech() {
		return tech;
	}





	public void setTech(String tech) {
		this.tech = tech;
	}





	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + ", tech=" + tech + "]";
	}
	 
	 
	 public void show() 
	 {
		 System.out.println("inside show method");
		 laptop.compile();
		 
		 
		 
	 }
	
	
}
