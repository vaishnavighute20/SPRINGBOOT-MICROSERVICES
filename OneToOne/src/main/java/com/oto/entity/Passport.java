package com.oto.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	Integer passportNo;
	LocalDate expDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PERSONID_FK",unique=true)
	Person person;
	public Integer getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(Integer passportNo) {
		this.passportNo = passportNo;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
