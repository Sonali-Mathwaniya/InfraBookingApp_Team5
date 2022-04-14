package com.zensar.entity;

public class Role {

	
	private int id;
	private String authority;

	 
	public Role() {
		super();
	}
 
	public Role(int id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", authority=" + authority + "]";
	}
	
	
	
	
	
	
	
	
	
}
