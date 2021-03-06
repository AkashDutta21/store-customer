package com.mindtree.customer.storecustomer.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class customer {
	
	@Id
	private long id;
	private String name;
	private String address;
	
	public customer() {
		
	}
	
	public customer(long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("customer [id=%s, name=%s, address=%s]", id, name, address);
	}

}
