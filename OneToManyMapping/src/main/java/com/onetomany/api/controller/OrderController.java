package com.onetomany.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.api.dto.OrderRequest;
import com.onetomany.api.dto.OrderResponse;
import com.onetomany.api.model.Customer;
import com.onetomany.api.model.Product;
import com.onetomany.api.repository.CustomerRepository;
import com.onetomany.api.repository.ProductRepository;

@RestController
public class OrderController {
	
	
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	 

	
	@PostMapping("/placeOrder")
	
	public Customer placeOrder(@RequestBody OrderRequest orderRequest)
	{
		//Customer customer = orderRequest.getCustomer();
		 
		return customerRepository.save(orderRequest.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrder()
	{
		return customerRepository.findAll();
	}
	
	@GetMapping("/joinInfo")
	public List<OrderResponse> findJoinInfo()
	{
		return customerRepository.getJoinInfo();
	}
	
}

