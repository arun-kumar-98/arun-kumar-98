package com.main.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Company;
import com.main.repository.ICompanyRepository;
import com.main.service.ICompanyService;

@Service
public class CompanyServiceImpl implements ICompanyService {

	@Autowired
	private ICompanyRepository companyRepository;

	@Override
	public Company saveComp(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public List<Company> getAllRecords() {
		return companyRepository.findAll();
	}

	@Override
	public Company removeOneRecord(Long id) {
		Company company = companyRepository.findById(id).get();
		companyRepository.delete(company);
		return company;
	}

	@Override
	public Company update(Long id, Company company) {
		Optional<Company> company2 = companyRepository.findById(id);
		if (company2.isPresent()) {
			Company newComp = company2.get();
			newComp.setCompanyAddress(company.getCompanyAddress());
			companyRepository.save(newComp);

		}

		return company2.get();
	}
}
