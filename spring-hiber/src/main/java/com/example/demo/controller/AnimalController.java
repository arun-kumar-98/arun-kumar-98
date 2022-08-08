package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.impl.AnimalDaoImpl;
import com.example.demo.model.Animals;

@RestController
@RequestMapping(value = { "/animal" })
public class AnimalController {

	@Autowired
	private AnimalDaoImpl animalService;

	@GetMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Animals> getAll(@PathVariable("id") int id) {
		Animals animals = animalService.findById(id);
		if (animals == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		} else
			return new ResponseEntity<>(HttpStatus.OK);

	}

	@PostMapping(value = { "/save" })
	public void createOne(Animals animals) {

		animalService.addAnimal(animals);
		/*
		 * HttpHeaders headers = new HttpHeaders();
		 * headers.setLocation(builder.path("/animal/{id}").buildAndExpand(animals.getId
		 * ()).toUri());
		 * 
		 * return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
		 */
	}

}
