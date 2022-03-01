package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Create Question class Object
		Question ques=new Question();
		ques.setQuestionId(1245);
		ques.setQuestion("What is Hibernate?");
		
		
		//Create Answer class Object-1
		Answer ans=new Answer();
		ans.setAnswerId(1424);
		ans.setAnswer("Hibernate is a Framework");
		ans.setQuestion(ques);
		
		//-----2
		Answer ans2=new Answer();
		ans2.setAnswerId(1425);
		ans2.setAnswer("Hibernate is use to data operation:");
		ans2.setQuestion(ques);
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(ans);
		list.add(ans2);

		ques.setAnswers(list);
		
		Session s=factory.openSession();
		 Transaction tx=s.beginTransaction();
		
		 
			/*
			 * s.save(ques); s.save(ans); s.save(ans2);
			 */
		 
		Question q1=(Question)s.get(Question.class,1245);
		
		System.out.println(q1.getQuestionId());
		System.out.println(q1.getQuestion());
		System.out.println(q1.getAnswers().size());
		
		//s.save(ans2);
		//s.save(ans2);
		tx.commit();
		s.close();
		factory.close();
	}

}
