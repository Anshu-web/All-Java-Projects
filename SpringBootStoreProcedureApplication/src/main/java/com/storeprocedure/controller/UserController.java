package com.storeprocedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.storeprocedure.dao.UserDao;
import com.storeprocedure.model.User;

@RestController
public class UserController {
	
	@Autowired
	UserDao userDao;
	
	@GetMapping("/getusers")
	public List<User> getUsers()
	{
		return userDao.getAllUsers();
	}
	
	@GetMapping("/getuserbyname/{name}")
	public List<User> getUserByName(@PathVariable String name)
	{
		return userDao.getUserById(name);
	}

}
