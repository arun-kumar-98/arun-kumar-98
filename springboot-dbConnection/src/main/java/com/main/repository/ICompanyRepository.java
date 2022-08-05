package com.main.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.entity.Company;

public interface ICompanyRepository extends JpaRepository<Company, Long> {

}
