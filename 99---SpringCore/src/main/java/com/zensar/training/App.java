package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.ci.Addition;
import com.zensar.training.ci.Person;
import com.zensar.training.ci.Size;
import com.zensar.training.collection.Emp;
import com.zensar.training.collection.Example;
import com.zensar.training.lifecycle.Pepsi;
import com.zensar.training.lifecycle.Samosa;
import com.zensar.training.model.Square;
import com.zensar.training.ref.A;

public class App {
  public static void main(String[] args) {
   
	  AbstractApplicationContext context=new ClassPathXmlApplicationContext("refer2.xml");
	  
	//  Person p=(Person)context.getBean("person1");
	  
	 // System.out.println(a);
	  
	 // A a=(A) context.getBean("aa1");
	  
	 // Addition add=(Addition)context.getBean("add");
	  //add.dosum();
	  
	 // Size s=(Size)context.getBean("size");
	  
	  
	//  Samosa s1=(Samosa)context.getBean("samosa");
	  
	  //Example e=(Example) context.getBean("exam");
	 
	 // Samosa s1=(Samosa)context.getBean("samosa");
	    
	  
	  Square s1=(Square)context.getBean("square");
	  
	  System.out.println(s1);  
	  
	  
	   
	  // Pepsi p=(Pepsi) context.getBean("pepsi");
	   
	 
	 // s1.setPrice(40);
	  //System.out.println(s1);
	  
	  context.registerShutdownHook();
	  
	  System.out.println("Hello World!");
  }
}
