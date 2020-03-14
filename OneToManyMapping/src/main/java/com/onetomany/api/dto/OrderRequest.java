package com.onetomany.api.dto;

import com.onetomany.api.model.Customer;
import com.onetomany.api.model.Product;

public class OrderRequest {
	
	
	private Customer customer;
	
	private Product product;

	

	public OrderRequest(Customer customer, Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}

	public OrderRequest() {
		super();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	

}
