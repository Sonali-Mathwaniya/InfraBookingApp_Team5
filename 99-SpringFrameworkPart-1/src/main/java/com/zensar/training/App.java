package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    
	  
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	  
	  
	//Car c=(Car)  context.getBean("car");
	  
	  
	 // c.drive();
	
	
	Emp  e1=(Emp)  context.getBean("emp1");
	
	System.out.println(e1);
	  
	  System.out.println("Hello World!");
     
    
  }
}
