package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMapping {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Emp object-1
		Emp e1=new Emp();
		e1.setEmpId(25);
		e1.setEmpName("Noman");
		
		//Emp object-2
		Emp e2=new Emp();
		e2.setEmpId(45);
		e2.setEmpName("Aayan");
		
		//Project object-1
		Project p1=new Project();
		p1.setProId(78);
		p1.setProName("Librery management system");
		
		//Project object-2
		Project p2=new Project();
		p2.setProId(79);
		p2.setProName("Hospital Management system:");
		
		//List of Emp
		List<Emp> emp=new ArrayList<Emp>();
		emp.add(e1);
		emp.add(e2);
		
		//List of Project
		List<Project> pro=new ArrayList<Project>();
		pro.add(p1);
		pro.add(p2);
		
		e1.setProjects(pro);
		p1.setEmployee(emp);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		tx.commit();
		s.close();
		factory.close();

	}

}
