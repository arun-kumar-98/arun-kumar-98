package com.main.service;

import java.util.List;

import com.main.entity.Company;

public interface ICompanyService {
	Company saveComp(Company company);

	List<Company> getAllRecords();

	Company removeOneRecord(Long id);

	Company update(Long id, Company company);

}
