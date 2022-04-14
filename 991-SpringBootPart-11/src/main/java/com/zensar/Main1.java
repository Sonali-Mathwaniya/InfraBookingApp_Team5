package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.bean.Alien;
import com.zensar.bean.Laptop;

public class Main1 {
 public static void main(String[] args) {
	
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);

		//Laptop l=context.getBean(Laptop.class);
	 Alien a=context.getBean(Alien.class);
	// a.setLaptop(l);
	 
	 a.show();
		
		
}
}
