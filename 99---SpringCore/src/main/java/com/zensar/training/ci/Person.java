package com.zensar.training.ci;

import java.util.List;

public class Person {

	
	private String name;
	private int id;
	private List<String> list;
	
 
    public Person() {
		super();
	}



	public Person(String name, int id,List<String> list) {
		super();
		this.name = name;
		this.id = id;
		this.list=list;
	}






	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getId() {
		return id;
	}






	public void setId(int id) {
		this.id = id;
	}






	public List<String> getList() {
		return list;
	}



	public void setList(List<String> list) {
		this.list = list;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}
