package com.main.service;

import java.util.List;

import com.main.entity.Specialization;

public interface ISpecializationService {

	List<Specialization> allSpecialization();

	Specialization getOneSpecialization(Long id);

	Long saveSpecializatio(Specialization specialization);

	String removeSpecialization(Long id);

	void updateOneSpecialization(Long id);

}
