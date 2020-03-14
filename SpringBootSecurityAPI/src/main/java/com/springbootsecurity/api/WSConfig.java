package com.springbootsecurity.api;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

 
public class WSConfig extends WebSecurityConfigurerAdapter {

	//Below is the authentication setup
	//Foe JPA authentication there is no out of the box implementation
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication()
		.withUser("Java")
		.password("Project")
		.roles("USER")
		.and()
		.withUser("Anshu")
		.password("Mishra")
		.roles("ADMIN");
	}

	@Bean
	public PasswordEncoder getPassword() {
		return NoOpPasswordEncoder.getInstance();
	}

	
	//Below is the authorization setup
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// http.authorizeRequests().antMatchers("/**").hasRole("IT").and().formLogin();
		
		
		//Will go from higher restrictive to lower restrictive 
		
		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasRole("USER")  //hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin();

	}

	
	 
	
}
