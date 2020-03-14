package com.onetomany.api.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onetomany.api.dto.OrderResponse;
import com.onetomany.api.model.Customer;

 
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	
	@Query("SELECT new com.onetomany.api.dto.OrderResponse(c.name,p.productName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInfo();
	
	// this will return the name and the productname
	 
	
	

}
