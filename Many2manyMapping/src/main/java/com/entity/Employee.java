package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private Double sal;
	private String dept;

	@ManyToMany
	private List<Project> project;

	public Employee() {
		super();
	}

	public Employee(Integer empId, String empName, Double sal, String dept, List<Project> project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.dept = dept;
		this.project = project;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

}
