package com.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Animal;

@Repository
public interface IAnimalRepo extends JpaRepository<Animal, Integer> {

}
