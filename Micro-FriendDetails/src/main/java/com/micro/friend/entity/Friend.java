package com.micro.friend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Friend {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private Integer id;
	@Column(name="PHONE_NO")
	private Long phoneNumber;
	@Column(name="FRIEND_NO")
	private Long friendNumber;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Long getFriendNumber() {
		return friendNumber;
	}
	public void setFriendNumber(Long friendNumber) {
		this.friendNumber = friendNumber;
	}
	
	

	

	

	

}
