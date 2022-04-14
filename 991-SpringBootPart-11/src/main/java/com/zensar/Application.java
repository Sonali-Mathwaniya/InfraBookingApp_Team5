package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
	// the container of spring bean is created on this line the movement you say springApplication run it creates spring container and here context is a refrenece for  initializing 
		//spring container and if spring container contains the spring bean it is return by getBean() method by passing class
	 
	/*	Alien a=context.getBean(Alien.class);
		a.setAid(101);
		a.setName("Sonali Mathwaniya");
		a.setTech("Java Programming");
		
		
		//here if i am creating Alien a1 then two objects will be created internally in spring container ? No it will not happen while running this code constructor is called once in the lifecycle of this program so the movement we run it only one object is created 
		// so internally spring container uses singleton scope for creating object. one object for one class   
		Alien  a1=context.getBean(Alien.class);
		a1.setAid(102);
		a1.setName("Ashish kumar");
		a1.setTech("python programming");
		
		Alien  a2=context.getBean(Alien.class);
		a2.setAid(103);
		a2.setName("rajesh gupta");
		a2.setTech("javascript programming");
		
		
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
			
		System.out.println("Springn project");
	
	*/
	
	}

}
