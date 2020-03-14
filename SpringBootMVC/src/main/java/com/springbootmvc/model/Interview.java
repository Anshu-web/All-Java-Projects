package com.springbootmvc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Interview {
	
	private String name;
	private String email;
	
	private Date dob;
	
	private ArrayList<String> skills;

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}
	
	

}
