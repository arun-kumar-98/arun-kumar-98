package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Flower;
import com.entity.Plants;

public class AppTest {

	public static void main(String[] args) {

		Session session = new Configuration().configure().buildSessionFactory().openSession();

		Plants plants = new Plants();
		Flower flower = new Flower();
		plants.setId(1);
		plants.setName("Rose");

		flower.setId(101);
		flower.setfName("rose");
		flower.setColor("pink");
		flower.setPlants(plants);

		Flower flower2 = new Flower();
		flower2.setId(102);
		flower2.setfName("rose");
		flower2.setColor("pink");
		flower2.setPlants(plants);

		// add to the list
		List<Flower> f = new ArrayList<>();
		f.add(flower2);
		f.add(flower);

		plants.setFlower(f);

		// perform the operation

		Transaction tx = session.beginTransaction();
		session.save(plants);
		session.save(flower);
		session.save(flower2);

		tx.commit();
		session.close();

	}

}
