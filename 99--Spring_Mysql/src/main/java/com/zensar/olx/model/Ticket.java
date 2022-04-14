package com.zensar.olx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double amount;
	private String category;
	
	
	public Ticket() {
		super();
	}


	public Ticket(int id, double amount, String category) {
		super();
		this.id = id;
		this.amount = amount;
		this.category = category;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Ticket [id=" + id + ", amount=" + amount + ", category=" + category + "]";
	}
	
	
	 
}
