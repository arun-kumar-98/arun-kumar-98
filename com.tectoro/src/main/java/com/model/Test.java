package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("com/resource/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Dept dept = new Dept();
		dept.setDeptName("dev");
		dept.setLoc("banglore");

		Employee e = new Employee();
		e.setName("Satyam");
		e.setSal(18000.0);
		e.setDept(dept);

		Dept dept1 = new Dept();
		dept1.setDeptName("dev");
		dept1.setLoc("banglore");

		Employee e1 = new Employee();
		e1.setName("Arun");
		e1.setSal(18000.0);
		e1.setDept(dept);

		ses.save(e);
		ses.save(e1);

		tx.commit();
		ses.close();

	}

}
