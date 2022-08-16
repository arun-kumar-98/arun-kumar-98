package com.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_tab")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@Column(length = 15, nullable = false)
	private String name;
	@Column(length = 4, nullable = false)
	private String department;
	@Column(length = 10, nullable = false)
	private Double salary;
	@Column(length = 50, nullable = false)
	private String address;
	@Column(length = 25, nullable = false)
	private String email;
	@Column(length = 10, nullable = false)
	private String phone;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String name, String department, Double salary, String address, String email,
			String phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
