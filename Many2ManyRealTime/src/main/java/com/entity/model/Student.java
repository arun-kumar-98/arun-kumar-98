package com.entity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "manystd")
public class Student {

	@Id
	private Integer stdId;
	private String stdName;
	private String address;

	@ManyToMany
	@JoinTable(name = "schoolstudent", joinColumns = { @JoinColumn(name = "schoolId") }, inverseJoinColumns = {
			@JoinColumn(name = "studentId") })
	private List<School> schools;

	public Student() {
		super();
	}

	public Student(Integer stdId, String stdName, String address, List<School> schools) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.address = address;
		this.schools = schools;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

}
