package com.springbootsecurity.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsecurity.api.repository.RoleRepository;
import com.springbootsecurity.api.repository.UserRepository;

@RestController
@RequestMapping("/secure/rest")
public class AdminController {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	
	@Autowired
	private BCryptPasswordEncoder PasswordEncoder;
	
	@PreAuthorize("hasAnyRole('IT')")
	@PostMapping("/admin/add")
	public String addUserByAdmin(@RequestBody com.springbootsecurity.api.model.User user)
	{
		
		  String pass=user.getPassword(); String
		  encryptPassword=PasswordEncoder.encode(pass);
		  user.setPassword(encryptPassword);
		 
		userRepo.save(user);
		return "user added successfully.....";
	}
	
	
	
	
	
	/*
	 * This is he root URL. 
	 * This should be accessed by everybody even without login.
	 */
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome To Home ";
	}
	
	// Should be accessible by logged in users that is both user and admin.
	
	@GetMapping("/user")
	public String User()
	{
		return "Welcome User";
	}
	
	/// Should be accessible only by the one who has the role of Admin
	
	@GetMapping("/IT")
	public String Admin()
	{
		return "Welcome IT";
	}
	
	

}
