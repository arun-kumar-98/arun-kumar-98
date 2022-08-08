package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Animal;
import com.main.service.IAnimal;

@RestController
public class AnimalController {

	@Autowired
	private IAnimal animalService;

	@PostMapping(value = "/save")
	public Animal saveAnmal(@RequestBody Animal animal) {
		System.out.println("insertion done..");
		return animalService.addAnimal(animal);
	}

	@GetMapping(value = "/animal")
	public List<Animal> allData() {

		return animalService.getAll();
	}

	@GetMapping(value = "/animal/{id}")
	public Animal getById(@PathVariable("id") int id) {
		return animalService.getById(id);
	}

	@DeleteMapping(value = "/animal/{id}")
	public void removeById(@PathVariable("id") int id) {
		animalService.deleteById(id);
		System.out.println("given   " + id + "record is deleted");
	}

	@PutMapping(value = "/update")
	public void up(@RequestBody Animal animal) {
		animalService.updateAnimal(animal);
	}

}
