package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Demo1Application {

	public static void main(String[] args) {
		
		
		System.out.println("hello");
		SpringApplication.run(Demo1Application.class, args);
	}

}
