package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {

	public static void main(String[] args) {
	

		System.out.println("Example:");
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Creating Student object
		Student s1=new Student();
		s1.setId(457);
		s1.setName("Ahmad");
		s1.setCity("Rayghar");
		s1.setCerti(new Certificate("Java hibernate course:","1 month"));
		
		//student :Persistent-session
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(s1);
	    
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
