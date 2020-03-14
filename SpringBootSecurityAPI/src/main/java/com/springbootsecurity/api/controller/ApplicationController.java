package com.springbootsecurity.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")  //URL based authentication not a role based 
public class ApplicationController {
	
	
	@GetMapping("/process")
	public String processing()
	{
		return "processing...";
	}

}
