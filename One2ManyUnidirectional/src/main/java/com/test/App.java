package com.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.entity.Child;
import com.entity.Parent;
import com.util.HibernateConfiguration;

public class App {

	private static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println("starting point");
		// logger.info("from here");

		Session session = new HibernateConfiguration().getFactory().openSession();
		Transaction tx = session.beginTransaction();
		/*
		 * Child ch = new Child(); ch.setFirst_name("pappu"); ch.setLast_name("kumar");
		 * ch.setAddress("bettiah");
		 * 
		 * Child ch1 = new Child(); ch1.setFirst_name("nitesh");
		 * ch1.setLast_name("kumar"); ch1.setAddress("bettiah");
		 * 
		 * Child ch3 = new Child(); ch3.setFirst_name("sanjeev");
		 * ch3.setLast_name("kumar"); ch3.setAddress("bettiah");
		 * 
		 * List<Child> childs = new ArrayList<>(); childs.add(ch); childs.add(ch1);
		 * childs.add(ch3);
		 * 
		 * Parent parent = new Parent(); parent.setpId(102);
		 * parent.setFname("Hiralal sharma"); parent.setMname("shobha devi");
		 * parent.sethNO(05); parent.setChild(childs);
		 * 
		 * // perform the operation Serializable i = session.save(parent); if (i !=
		 * null) { System.out.println("inserted successfully"); }else {
		 * System.out.println("successfully inserted"); }
		 */
		// transaction commit

		Parent p = (Parent) session.get(Parent.class, 102);
		System.out.println(p);
		// logger.info("{}", p);

		for (Child ch : p.getChild()) {
			System.out.println(ch.getId() + " " + ch.getFirst_name() + " " + ch.getLast_name() + " " + ch.getAddress());

			// logger.info("{}", ch);
		}

		tx.commit();

		// close session
		session.close();

	}
}
