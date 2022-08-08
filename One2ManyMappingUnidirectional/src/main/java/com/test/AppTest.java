package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Course;
import com.entity.Student;

public class AppTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		// Student details

		Student s = new Student();
		Course c = new Course();
		c.setId(101);
		c.setCourse("jabs");
		c.setStudent(s);

		Course c2 = new Course();
		c2.setId(102);
		c2.setCourse("yhj");
		c2.setStudent(s);

		List<Course> list = new ArrayList<Course>();
		list.add(c);
		list.add(c2);

		s.setAddr("hyd");
		s.setName("Arun kumar");
		s.setCourse(list);

		ses.save(s);
		ses.save(c);
		ses.save(c2);
		System.out.println("saving successfully.....");

		tx.commit();
		ses.close();
		sf.close();

	}

}
