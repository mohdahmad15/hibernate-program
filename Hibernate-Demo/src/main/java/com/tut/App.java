package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started..." );
//        Configuration cfg=new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory=cfg.buildSessionFactory();
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       //Creating Student
        
		/*
		 * Student st=new Student(); st.setId(455); st.setName("Arman");
		 * st.setCity("Lucknow");
		 */
        
        //System.out.println(st);
        
        //Creating object Address class
        Address ad=new Address();
        ad.setStreet("street2");
        ad.setCity("Jhansi");
        ad.setOpean(true);
        ad.setAddedDate(new Date());
        ad.setX(123.455);
        
        //Set object of Student and 
        
        
        //image reading
       // FileInputStream fis=new FileInputStream("src/main/java/arman.PNG");
        //byte[] data=new byte[fis.available()];
        //fis.read(data);
        //ad.setImage(data);
        Session session=sessionFactory.openSession();
        //
        Transaction tx=session.beginTransaction();
        //session.save(st);
        //session.save(ad);
//        session.save(st);
//        session.save(ad);)
        tx.commit();
        session.close();
        System.out.println("Done...");
    }
}
