package com.zensar.standalone.collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		 AbstractApplicationContext context=new ClassPathXmlApplicationContext("aloneConfig.xml");
		 
		 
		 
		 Person person1 =(Person) context.getBean("person1", Person.class);
		 
		 System.out.println(person1);
		
	}
}
