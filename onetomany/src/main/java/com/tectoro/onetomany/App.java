package com.tectoro.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tectoro.onetomany.model.Courses;
import com.tectoro.onetomany.model.Student;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Student student = new Student();
		student.setStudentId(101);
		student.setStudentName("satyam");

		Courses c = new Courses();
		c.setCourseId(20);
		c.setCoursename("java");
		c.setStudent(student);

		Courses c1 = new Courses();
		c1.setCourseId(21);
		c1.setCoursename("SQL");
		c1.setStudent(student);

		Courses c2 = new Courses();
		c2.setCourseId(23);
		c2.setCoursename("java");
		c2.setStudent(student);

		List<Courses> l = new ArrayList<Courses>();
		l.add(c);
		l.add(c1);
		l.add(c2);

		student.setCourse(l);

		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		ses.save(student);
		ses.save(c);
		ses.save(c1);
		ses.save(c2);

		tx.commit();
		ses.close();
		sf.close();

	}
}
