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
public class Customer {
@Id
private Integer customerId;
@Column(length=15)
private String customerName;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="CUSTOMER_ITEMS",joinColumns=@JoinColumn(name="CUSTOMERID_FK"),inverseJoinColumns=@JoinColumn(name="ITEMID_FK"))
private List<Item>items;


public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public List<Item> getItems() {
	return items;
}
public void setItems(List<Item> items) {
	this.items = items;
}	


}
