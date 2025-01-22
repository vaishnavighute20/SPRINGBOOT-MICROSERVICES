package com.mtm.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Item {

	@Id
	private Integer itemId;
	@Column(length=15)
	private String itemName;
	/*
	// if we want to perform operation item to customer ie bi-directional
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="CUSTOMER_ITEMS",joinColumns=@JoinColumn(name="CUSTOMERID_FK"),inverseJoinColumns=@JoinColumn(name="ITEMID_FK"))
     private List<Customer>customers;
	
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	*/
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	 
	
}
