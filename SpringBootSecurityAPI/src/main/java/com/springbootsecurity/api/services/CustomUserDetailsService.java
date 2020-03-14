package com.springbootsecurity.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springbootsecurity.api.model.User;
import com.springbootsecurity.api.repository.UserRepository;

  
@Service

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	//UserDetails is another class where we mention the username and pass by getting the details from user class.

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			
		 
	User user=userRepository.findByusername(username);
	
	CustomUserDetails userDetails=null;
	
	if(user!=null)
	{
		userDetails=new CustomUserDetails();
		
		userDetails.setUser(user);
	}
	else
	{
		throw new UsernameNotFoundException("User does not exist with username "+username); 
	}
	
		return userDetails;
	}

}
