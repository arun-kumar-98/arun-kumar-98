package com.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {

		Session session = new HibernateConfiguration().getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();

		Student student = new Student();
		student.setStdId(1001);
		student.setStdName("Arun");
		student.setAddress("Bettiah");

		Student student1 = new Student();
		student1.setStdId(1002);
		student1.setStdName("Arun");
		student1.setAddress("Bettiah");

		School school = new School();
		school.setName("GMV");
		school.setLocation("pakhnaha");

		School school1 = new School();
		school1.setName("PHS");
		school1.setLocation("Bhopal");

		// add students to the list
		List<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student1);

		// add Schools to list
		List<School> list2 = new ArrayList<>();
		list2.add(school);
		list2.add(school1);

		// save the details

		student.setSchools(list2);
		school.setStudent(list);

		session.save(student);
		session.save(student1);

		session.save(school);
		session.save(school1);

		tx.commit();
		session.close();

	}
}
