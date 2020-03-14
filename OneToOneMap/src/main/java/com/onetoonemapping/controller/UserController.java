package com.onetoonemapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoonemapping.model.User;
import com.onetoonemapping.repository.UserRepository;

@RestController
@RequestMapping("/rest")
public class UserController {
	
	@Autowired
	UserRepository ur;
	
	@PostMapping("/save")
	public String save(@RequestBody User user)
	{
		 ur.save(user);
		 
		 return "user saved successfully";
	}
  

}
