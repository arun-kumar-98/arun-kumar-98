package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Specialization;

@Repository
public interface ISpecializationRepository extends JpaRepository<Specialization, Long> {

}
