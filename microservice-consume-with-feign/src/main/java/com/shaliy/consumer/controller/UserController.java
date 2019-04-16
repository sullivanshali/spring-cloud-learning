package com.shaliy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shaliy.consumer.entity.User;
import com.shaliy.consumer.feign.ProviderFeignClient;

@RestController
public class UserController {

	@Autowired
	private ProviderFeignClient providerFeignClient;
	
	@GetMapping("/findOne/{id}")
	public User findById(@PathVariable Long id) {
		return providerFeignClient.findById(id);
	}
}
