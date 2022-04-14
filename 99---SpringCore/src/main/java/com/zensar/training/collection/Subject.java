package com.zensar.training.collection;

import org.springframework.stereotype.Component;

@Component
public class Subject {

	private String maths;
	private String science;
	private String english;

	 
	
	public Subject() {
		super();
	}

 
	public Subject(String maths, String science, String english) {
		super();
		this.maths = maths;
		this.science = science;
		this.english = english;
	}


	public String getMaths() {
		return maths;
	}


	public void setMaths(String maths) {
		this.maths = maths;
	}


	public String getScience() {
		return science;
	}


	public void setScience(String science) {
		this.science = science;
	}


	public String getEnglish() {
		return english;
	}


	public void setEnglish(String english) {
		this.english = english;
	}


	@Override
	public String toString() {
		return "Subject [maths=" + maths + ", science=" + science + ", english=" + english + "]";
	}
	
	
	
	
	
}