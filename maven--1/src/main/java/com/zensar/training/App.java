package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
 
	  Car c=new Car(501,"Bolero");
 	 
	  Configuration con=new Configuration().configure().addAnnotatedClass(Car.class);
	  
       SessionFactory sf=con.buildSessionFactory();
	  Session session=sf.openSession();

	  Transaction tx=session.beginTransaction();
	  
	  session.save(c);	  
	  tx.commit();
  }
}
