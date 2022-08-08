package com.main.service;

import java.util.List;

import com.main.model.Animal;

public interface IAnimal {
	Animal addAnimal(Animal animal);

	List<Animal> getAll();

	Animal getById(int id);

	void deleteById(int id);

	void updateAnimal(Animal animal);

}
