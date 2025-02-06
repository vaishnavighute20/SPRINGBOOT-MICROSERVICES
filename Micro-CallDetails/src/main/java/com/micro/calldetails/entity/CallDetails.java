package com.micro.calldetails.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="logs")
public class CallDetails {

	@Id
	private Long callId;
	private Long calledBy;
	private Long calledTo;
	@Temporal(TemporalType.DATE)
	private Date calledOn;
	private Long durationInSeconds;
	
	public Long getCallId() {
		return callId;
	}
	public void setCallId(Long callId) {
		this.callId = callId;
	}
	public Long getCalledBy() {
		return calledBy;
	}
	public void setCalledBy(Long calledBy) {
		this.calledBy = calledBy;
	}
	public Long getCalledTo() {
		return calledTo;
	}
	public void setCalledTo(Long calledTo) {
		this.calledTo = calledTo;
	}
	public Date getCalledOn() {
		return calledOn;
	}
	public void setCalledOn(Date calledOn) {
		this.calledOn = calledOn;
	}
	public Long getDurationInSeconds() {
		return durationInSeconds;
	}
	public void setDurationInSeconds(Long durationInSeconds) {
		this.durationInSeconds = durationInSeconds;
	}	

}
