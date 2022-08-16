package com.main.service;

import java.util.List;

import com.main.entity.Employee;

public interface IEmployeeService {

	Employee addNewEmployee(Employee employeeRequest);

	List<Employee> getAll();

	void remove(Integer id);

	Employee getOne(Integer id);

}
