package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("com/model/hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		App app = new App();
		app.setId(103);
		app.setName("satyam");
		session.save(app);
		transaction.commit();
		session.close();

	}

}
