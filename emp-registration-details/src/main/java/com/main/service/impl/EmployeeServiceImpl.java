package com.main.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.entity.Employee;
import com.main.repository.IEmployeeRepository;
import com.main.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository employeeRepository;

	@Override
	public Employee addNewEmployee(Employee employeeRequest) {

		return employeeRepository.save(employeeRequest);
	}

	@Override
	public List<Employee> getAll() {

		return employeeRepository.findAll();
	}

	@Override
	public void remove(Integer id) {
		employeeRepository.deleteById(id);

	}

	@Override
	public Employee editDetails(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Employee getOne(Integer id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			Employee employee = optional.get();
		}
		return null;
		
	}
}
