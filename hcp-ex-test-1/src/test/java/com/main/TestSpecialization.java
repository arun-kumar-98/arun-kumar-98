package com.main;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.main.entity.Specialization;
import com.main.repository.ISpecializationRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TestSpecialization {

	@Autowired
	private ISpecializationRepository specializationRepository;

	@Test
	public void testAddSpecialization() {
		Specialization specialization = specializationRepository
				.save(new Specialization(1, "CRLDS", "CARDIOLOGIST", "EXPERT IN HEART AND VEINS"));
		assertNotNull(specialization);

	}

}
