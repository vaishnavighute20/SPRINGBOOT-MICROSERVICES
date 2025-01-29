package com.pms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {

	@Id
	private Integer productId;
	@Column(length = 15)
	private String productName;
	private Double price;
	@Column(length = 20)
	private String manufacturer;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
/* 	
	// testing in swagger
//http://localhost:8888/swagger-ui.html

// testing in postman

1. Fetching All Products
 
http://localhost:8888/allproducts


2. Fetching a Product by ID
 
http://localhost:8888/{id}
 
http://localhost:8888/1
 

3. Fetching Products by Manufacturer
 
http://localhost:8888/products/{manufacturer}
 
http://localhost:8888/products/Samsung
 


4. Adding a New Product
 
http://localhost:8888/product/add
 
{
    "productId": 10,
    "productName": "Tablet",
    "price": 15000.0,
    "manufacturer": "Samsung"
}
5. Updating an Existing Product/
 
http://localhost:8888/product/update
 
{
    "productId": 10,
    "productName": "Tablet Pro",
    "price": 18000.0,
    "manufacturer": "Samsung"
}
6. Deleting a Product by ID
 
http://localhost:8888/product/delete/{id}
 
http://localhost:8888/product/delete/1
 
*/

	
}
