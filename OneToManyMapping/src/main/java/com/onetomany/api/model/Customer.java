package com.onetomany.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id; // Customer id will act as a FK in the product table.
	
	private String name;
	private String email;
	private String gender;
	
	
	/*================================================Step First
	 * @OneToMany(targetEntity = Product.class,mappedBy = "customer", cascade =
	 * CascadeType.ALL,fetch = FetchType.LAZY) //@JoinColumn(name =
	 * "cp_fk",referencedColumnName ="id" ) //referencedColumnName means which id
	 * you want map as FK.
	 * 
	 *///===============================================================================
	 
	@OneToMany(targetEntity = Product.class, cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name ="cp_fk",referencedColumnName ="id" )
	private List<Product> products;
	
 
	
	public Customer(int id, String name, String email, String gender, List<Product> products) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.products = products;
	}

	public Customer() {
		 
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	
	

}
