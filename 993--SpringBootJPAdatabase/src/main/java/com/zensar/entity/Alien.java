package com.zensar.entity;

public class Alien {

	private int aid;
	private String aname;
	private String lang;
	
	
	
	
	
	public Alien() {
		super();
	}





	public Alien(int aid, String aname, String lang) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.lang = lang;
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





	public String getLang() {
		return lang;
	}





	public void setLang(String lang) {
		this.lang = lang;
	}





	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", lang=" + lang + "]";
	}
	
	
	
	
	
	
	
}
