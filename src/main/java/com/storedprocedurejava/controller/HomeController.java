package com.storedprocedurejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.storedprocedurejava.domain.User;
import com.storedprocedurejava.service.UserService;

@RestController
public class HomeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
public List<User> findUser() {	
	return userService.getUsers();
}
	
	@RequestMapping("/specific/{username}")
	public List<User>findSUser(@PathVariable String username){
		return userService.getSpecificUser(username);
	}
	
}
