package com.shaliy.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.shaliy.consumer.entity.User;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "findByIdFallBack",
		    commandProperties = {
		      @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
		    }
		)
	@GetMapping("/findOne/{id}")
	public User findById(@PathVariable Long id) {
		return restTemplate.getForObject("http://microservice-provider/findById/"+id, User.class);
	}
	
	public User findByIdFallBack(Long id) {
		User u = new User();
		u.setId(1L);
		return u;
	}
}
