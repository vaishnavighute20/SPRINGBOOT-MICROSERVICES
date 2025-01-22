package com.jpa.entity;
 import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
// @NamedQuery(name="Passenger.getPassengerBySeat",query="select p from Passenger p where p.seatNo>:seatN")
public class Passenger {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer PassengerId;
  
  @Column(length=12)
  private String firstName; 

  @Column(length=12)
  private String lastName;

  @Column(length=20)
  private String email;
  
  private Integer seatNo;

public Integer getPassengerId() {
	return PassengerId;
}

public void setPassengerId(Integer passengerId) {
	PassengerId = passengerId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Integer getSeatNo() {
	return seatNo;
}

public void setSeatNo(Integer seatNo) {
	this.seatNo = seatNo;
}

 
  
}
