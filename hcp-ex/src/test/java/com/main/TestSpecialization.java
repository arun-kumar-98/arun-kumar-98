package com.main;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.main.entity.Specification;
import com.main.repository.ISpecificationRepository;

@DataJpaTest(showSql = true)
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class TestSpecialization {

	@Autowired
	private ISpecificationRepository specificationRepository;

	/**
	 * add method testing
	 */

	@Test
	@Order(1)
	public void testAddSpecialization() {
		Specification specification = new Specification(null, "CRLDS", "CARDIOLOGIST", "EXPERT INCRLDS");

		try {
			specification = specificationRepository.save(specification);
		} catch (Exception exception) {
			exception.printStackTrace();

		}
		//assertNull(specification.getSpecid(), "specialization not created!");

	}
}
