package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.autowire.A;
import com.zensar.autowire.B;

public class Main4 {

	public static void main(String[] args) {
		 
		ApplicationContext context=new AnnotationConfigApplicationContext();
		
		
		A a=(A) context.getBean("a11");
		a.setRollno(101);
		a.setB(new B(555,"jaya"));
		
		System.out.println(a);
		
		System.out.println("Hello world");
		
		
	}

}
