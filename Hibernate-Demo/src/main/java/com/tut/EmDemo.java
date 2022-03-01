package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student stu=new Student();
        stu.setId(124);
        stu.setName("ArmanKhan");
        stu.setCity("Kanpur");
        
        Certificate certi1=new Certificate();
        certi1.setCourse("MBA-IT");
        certi1.setDuration("2-Month");
        stu.setCerti(certi1);
        
        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();
		s.save(stu);
        tx.commit();
		factory.close();

	}

}
