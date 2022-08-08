package com.example.demo.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAnimalDetails;
import com.example.demo.model.Animals;

@Service
public class AnimalDaoImpl implements IAnimalDetails {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addAnimal(Animals animals) {
		Session session = sessionFactory.getCurrentSession();
		session.save(animals);

	}

	@Override
	public List<Animals> getAnimal() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Animals> query = builder.createQuery(Animals.class);
		Root<Animals> root = query.from(Animals.class);

		query.select(root);
		TypedQuery<Animals> typedQuery = session.createQuery(query);
		return typedQuery.getResultList();
	}

	@Override
	public Animals findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Animals animals = session.get(Animals.class, id);

		return animals;
	}

	@Override
	public Animals update(Animals animals, int id) {
		Session session = sessionFactory.getCurrentSession();
		Animals animals2 = findById(id);
		animals.setName(animals.getName());
		animals2.setColor(animals.getColor());

		session.update(animals2);

		return animals;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Animals animals = session.get(Animals.class, id);

		session.delete(animals);

	}

}
