package com.springsecurity.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class SpringSecurityJDBCApplication {
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringSecurityJDBCApplication.class, args);
	}

}
