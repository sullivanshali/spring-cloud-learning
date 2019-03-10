package com.shaliy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shaliy.consumer.entity.User;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/findOne/{id}")
	public User findById(@PathVariable Long id) {
		return restTemplate.getForObject("http://microservice-provider/findById/"+id, User.class);
	}
}
