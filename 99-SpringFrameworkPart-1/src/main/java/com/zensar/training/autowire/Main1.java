package com.zensar.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.Emp;

public class Main1 {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		  
		 Emp e1=(Emp) context.getBean("emp1", Emp.class);
		
		
		 
		
		System.out.println(e1);
		  
		  System.out.println("Hello World!");
	}
}
