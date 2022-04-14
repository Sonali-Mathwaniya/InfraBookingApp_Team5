package com.zensar.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		 ApplicationContext context=new AnnotationConfigApplicationContext("abc.xml");
		 
		 
		 A a=(A) context.getBean(A.class);
		 
		 //Emp e1=(Emp) context.getBean("employee");
		 
		   
		 //System.out.println(e1);
		 System.out.println(a);
			 
		 //System.out.println(person1);
		
	}
}
