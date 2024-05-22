package com.hibernate.demo;

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
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	//create session factory
    	SessionFactory sessionFactory=cfg.buildSessionFactory();
    	
    	//open session
    	Session session=sessionFactory.openSession();
    	
    	//begin transaction
    	Transaction tr=session.beginTransaction();
    	
    	Student stud=new Student();
    	
    	stud.setStId(1);
    	stud.setStName("Sakuu");
    	stud.setStAdd("Pune");
    	stud.setStPhone(93250);
    	
    	session.save(stud);
    	
    	tr.commit();
    	
    	session.close();
    	
    	System.out.println("student add hua...");
    }
}
