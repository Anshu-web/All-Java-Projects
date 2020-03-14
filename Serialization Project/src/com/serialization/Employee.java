package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4638919727835550096L;
	/**
	 * 
	 */
 	private int id;
	private String name;
	private int age;
	private String email;
	private String password;
	
	private Address address;
	 
	
	public Employee(int id, String name, int age, String email, String password) {
		
		
		System.out.println("Constructor is getting called....");		
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", password=" + password
				+ "]";
	}
	
	
	

}
