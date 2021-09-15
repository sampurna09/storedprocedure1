package com.storedprocedurejava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storedprocedurejava.domain.User;
import com.storedprocedurejava.repository.UserRepository;
import com.storedprocedurejava.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public List<User> getUsers() {
		return userRepository.getUsers();
	}


	@Override
	public List<User> getSpecificUser(String username) {
		return userRepository.getSpecificUser(username);
	}

}
