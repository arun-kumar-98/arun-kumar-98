package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Dept;
import com.model.Employee;

public class EmpDao {

	public void saveEmp(Employee employee) {
		Session session = new HibernateUtil().getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		session.close();
	}

	public void saveDept(Dept dept) {
		Session session = new HibernateUtil().getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(dept);
		tx.commit();
	}

}
