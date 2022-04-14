package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.anno.xml.Employee;

public class App {
  public static void main(String[] args) {
	  ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	  Employee emp = context.getBean("employee", Employee.class);
	  
	  System.out.println(emp);
  }
}
