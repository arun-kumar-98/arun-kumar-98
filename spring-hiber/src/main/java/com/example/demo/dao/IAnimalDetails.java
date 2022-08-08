package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Animals;

public interface IAnimalDetails {

	void addAnimal(Animals animals);

	List<Animals> getAnimal();

	Animals findById(int id);

	Animals update(Animals animals, int id);

	void delete(int id);

}
