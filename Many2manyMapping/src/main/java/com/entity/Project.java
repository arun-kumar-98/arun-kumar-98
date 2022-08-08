package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "prj1")
public class Project {

	@Id
	private Integer projId;
	private String title;

	@ManyToMany
	private List<Employee> employee;

	public Project() {
		super();
	}

	public Project(Integer projId, String title, List<Employee> employee) {
		super();
		this.projId = projId;
		this.title = title;
		this.employee = employee;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

}
