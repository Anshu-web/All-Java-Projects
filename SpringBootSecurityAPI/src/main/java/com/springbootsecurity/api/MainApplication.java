package com.springbootsecurity.api;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springbootsecurity.api.repository.UserRepository;

@SpringBootApplication
 public class MainApplication {
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(MainApplication.class, args);
		
		 
	}

}
