package com.zensar.training.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
	//ApplicationContext context=new ClassPathXmlApplicationContext("class.xml");
	
	
	ApplicationContext context=new AnnotationConfigApplicationContext("class.xml");
	
	Example exam=(Example)context.getBean(Example.class);
	
	System.out.println(exam);
	
	
	
}
}
