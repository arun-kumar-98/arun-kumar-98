package com.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.Animal;
import com.main.repo.IAnimalRepo;
import com.main.service.IAnimal;

@Service
public class AnimalServiceImpl implements IAnimal {

	@Autowired
	private IAnimalRepo animalRepo;

	@Override
	public Animal addAnimal(Animal animal) {
		return animalRepo.save(animal);
	}

	@Override
	public List<Animal> getAll() {

		List<Animal> animals = new ArrayList<>();
		animals = animalRepo.findAll();
		return animals;
	}

	@Override
	public Animal getById(int id) {

		return animalRepo.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		animalRepo.deleteById(id);

	}

	@Override
	public void updateAnimal(Animal animal) {
		animalRepo.save(animal);

	}

}
