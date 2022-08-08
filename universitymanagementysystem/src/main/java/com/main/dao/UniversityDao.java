package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.University;
@Repository
public interface UniversityDao extends JpaRepository<University, Integer> {

}
