package com.thbs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	private int number;
	private String name;
	private String source;
	private String destination;
	private int price;
	
	public Train() {
		
	}
	
	public Train(int number, String name, String source, String destination, int price) {
		super();
		this.number = number;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Train [number=" + number + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", price=" + price + "]";
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
