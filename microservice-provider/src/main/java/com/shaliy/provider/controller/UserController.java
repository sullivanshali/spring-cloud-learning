package com.shaliy.provider.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shaliy.provider.entity.User;
import com.shaliy.provider.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/findById/{id}")
	public Optional<User> findById(@PathVariable Long id) {
		
		return userRepository.findById(id);
	}
	
}
