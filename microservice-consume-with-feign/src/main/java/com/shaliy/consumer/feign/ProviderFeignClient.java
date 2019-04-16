package com.shaliy.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shaliy.consumer.entity.User;

@FeignClient(name = "microservice-provider")
public interface ProviderFeignClient {

	@RequestMapping("/findById/{id}")
	User findById(@PathVariable Long id);
}


