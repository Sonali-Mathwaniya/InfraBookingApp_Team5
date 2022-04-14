package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.Emp;

public class App {
  public static void main(String[] args) {


	  ApplicationContext context=new ClassPathXmlApplicationContext("class.xml");
	  
	  Emp e1=(Emp)  context.getBean("emp1", Emp.class);
	  
	  System.out.println(e1);
	  
  }
}
