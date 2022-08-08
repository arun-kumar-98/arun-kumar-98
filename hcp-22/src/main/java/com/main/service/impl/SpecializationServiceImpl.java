package com.main.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Specialization;
import com.main.repository.ISpecializationRepository;
import com.main.service.ISpecializationService;

@Service
public class SpecializationServiceImpl implements ISpecializationService {

	@Autowired
	private ISpecializationRepository specializationRepository;

	/**
	 * @author Arun K
	 * @param no param
	 * 
	 * @return return list of record
	 * 
	 */

	@Override
	public List<Specialization> allSpecialization() {
		return specializationRepository.findAll();
	}

	/**
	 * @param integer id
	 * 
	 * @return Object(Entity type)
	 */

	@Override
	public Specialization getOneSpecialization(Long id) {
		Specialization specialization = specializationRepository.findById(id).get();
		return specialization;
	}

	@Override
	public String removeSpecialization(Long id) {
		Optional<Specialization> specialization = specializationRepository.findById(id);
		if (specialization.isPresent()) {
			specializationRepository.deleteById(id);
			return "id " + id + " record is removed";
		} else {
			return "given " + id + " does not exists";
		}

	}

	@Override
	public Long saveSpecializatio(Specialization specialization) {

		return specializationRepository.save(specialization).getId();
	}

	@Override
	public void updateOneSpecialization(Long id) {

	}

}
