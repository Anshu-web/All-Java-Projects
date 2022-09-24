package com.springBootRest;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Entity
public class College {
	@Id
	int rNumber;
	String name;
	
  	Date dateOfEstablishment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getrNumber() {
		return rNumber;
	}
	public void setrNumber(int rNumber) {
		this.rNumber = rNumber;
	}
	public Date getDateOfEstablishment() {
		return dateOfEstablishment;
	}
	public void setDateOfEstablishment(Date dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}
	public College(String name, int rNumber, Date dateOfEstablishment) {
		super();
		this.name = name;
		this.rNumber = rNumber;
		this.dateOfEstablishment = dateOfEstablishment;
	}
	
	

}
