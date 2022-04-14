package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.annotation.Employee;


 
public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		  Employee emp =(Employee) context.getBean(Employee.class);
		  
		  
		 // emp.setDepartment(new Department());
		  System.out.println(emp);
		
		
	}
	
}
