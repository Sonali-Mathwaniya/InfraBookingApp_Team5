package com.zensar.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloClientController {

	@GetMapping("/sayHello")
	public String f1() 
	{ 
		RestTemplate restTemplate;
		restTemplate=new RestTemplate();
		
		String regval=restTemplate.getForObject("http://localhost:8083/greet/Ramesh", String.class);
		
		return regval;
		
		
		
	}
	
}
