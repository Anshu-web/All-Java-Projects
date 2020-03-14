package com.springsecurity.jdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	
	@GetMapping("/")
	public String home()
	{
		return "Welcome To JDBC HOME  ";
	}
	
	// Should be accessible by logged in users that is both user and admin.
	
	@GetMapping("/user")
	public String User()
	{
		return "Welcome User JDBC";
	}
	
	/// Should be accessible only by the one who has the role of Admin
	
	@GetMapping("/admin")
	public String Admin()
	{
		return "Welcome Admin JDBC";
	}

}
