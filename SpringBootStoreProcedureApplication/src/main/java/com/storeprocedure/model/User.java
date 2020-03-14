package com.storeprocedure.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name="firstProcedure",procedureName = "getUsers"),
	@NamedStoredProcedureQuery(name="secondProcedure",procedureName = "getUserByName",
		
		parameters = {@StoredProcedureParameter(mode = ParameterMode.IN, name="ByName", type = String.class)})}) 

public class User {
	
	@Id
	private long id;
	
	@Column(name="first_Name")
	private String firstName;
	
	@Column(name="last_Name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
