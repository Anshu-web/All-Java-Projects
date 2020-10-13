package com.springbootsecurity.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
 
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int role_id;
	
	private String role;
	

	public Role(int role_id, String role) {
		super();
		this.role_id = role_id;
		this.role = role;
	}


	public Role() {
		 
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

}