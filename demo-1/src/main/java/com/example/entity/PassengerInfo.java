package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="PASSENGER_INFO")
public class PassengerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String name;
	private String email;
	private String source;
	private String destination;
	private String pickupTime;
	private String arrivalTime;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy") 
	
	// we will pass the date in string format in json request
	
	private Date travelDate;
	private double fare;
	
	
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public PassengerInfo(Long pid, String name, String email, String source, String destination, String pickupTime,
			String arrivalTime, Date travelDate, double fare) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.source = source;
		this.destination = destination;
		this.pickupTime = pickupTime;
		this.arrivalTime = arrivalTime;
		this.travelDate = travelDate;
		this.fare = fare;
	}
	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
 
	

}
