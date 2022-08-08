package com.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Specialization;
import com.main.repository.ISpecializationRepository;
import com.main.service.ISpecializationService;

@Service
public class SpecializationServiceImpl implements ISpecializationService {

	@Autowired
	private ISpecializationRepository specializationRepository;

	@Override
	public List<Specialization> getSpecialization() {
		// TODO Auto-generated method stub
		return specializationRepository.findAll();
	}
}
