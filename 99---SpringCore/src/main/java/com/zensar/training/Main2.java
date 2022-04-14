package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.quilifierworking.Address;
import com.zensar.training.lifecycle.Pepsi;

public class Main2 {

	public static void main(String[] args) {
		 
		
ApplicationContext context=new ClassPathXmlApplicationContext("quilifier.xml");
		
		
  Address add=(Address) context.getBean("address");


		System.out.println(add);
		
		
		
		
		
		
	}

}
