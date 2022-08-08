package com.main.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.dao.IStudentDao;
import com.main.entity.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;

	}

	@Override
	public String saveStudent(Student student) {
		Session session = this.sessionFactory.openSession();
		session.save(student);
		return "student added successfully";

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudent() {
		List<Student> list;
		Session session = this.sessionFactory.openSession();
		list = session.createQuery("from com.main.entity.Student").list();
		return list;
	}

	@Override
	public String deleteStudent(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		Student student = session.load(Student.class, id);
		if (student != null) {
			session.delete(student);
		} else {
			System.out.println("id not exist in table");
		}
		return "student deleted successfully";
	}

	@Override
	public Student getStudentById(Integer id) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Student.class, id);
	}

}
