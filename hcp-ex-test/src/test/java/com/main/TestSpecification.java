package com.main;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.main.entity.Specification;
import com.main.repository.ISpecificationRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(true)
public class TestSpecification {

	@Autowired
	private ISpecificationRepository specificationRepository;

	@Test
	public void addSpecification() {
		Specification specification = new Specification(1, "crdls", "cardiligist", "expert in crdls");

		specificationRepository.save(specification);

		assertNotNull(specification.getId());

	}

}
