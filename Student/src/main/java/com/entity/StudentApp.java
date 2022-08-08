package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("com/entity/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tx=sess.beginTransaction();
		
		Student s=new Student();
		s.setId(101);
		s.setName("salman");
		
		sess.save(s);
		tx.commit();
		sess.close();
		
		

	}

}
