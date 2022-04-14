package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.collection.Emp;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("quilifier.xml");
		
         Emp  e1=(Emp) context.getBean("employee", Emp.class);
         
         System.out.println(e1);

         System.out.println("Hello java world");
		
		
		
		
		
	}

}
