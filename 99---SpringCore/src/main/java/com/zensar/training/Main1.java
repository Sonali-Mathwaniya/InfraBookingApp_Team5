package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.lifecycle.Pepsi;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("refer2.xml");
		
		Pepsi p= (Pepsi) context.getBean("pepsi");
		System.out.println(p);
		
		
		
		
		
	}

}
