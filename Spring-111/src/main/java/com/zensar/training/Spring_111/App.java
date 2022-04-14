package com.zensar.training.Spring_111;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
   
	 ApplicationContext context=new ClassPathXmlApplicationContext();
	  
	  System.out.println("Hello World!");
  }
}
