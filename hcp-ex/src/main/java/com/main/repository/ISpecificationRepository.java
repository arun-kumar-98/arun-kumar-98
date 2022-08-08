package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Specification;

@Repository
public interface ISpecificationRepository extends JpaRepository<Specification, Long> {

}
