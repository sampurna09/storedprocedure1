package com.storedprocedurejava.service;

import java.util.List;

import com.storedprocedurejava.domain.User;

public interface UserService {

	List<User> getUsers();

	List<User> getSpecificUser(String username);
	
	

}
