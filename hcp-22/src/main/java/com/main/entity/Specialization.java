package com.main.entity;

import javax.persistence.Entity;

@Entity
public class Specialization {
	private Long id;

	private String specializationCode;
	private String name;
	private String note;

	public Specialization() {
		super();
	}

	public Specialization(Long id, String specializationCode, String name, String note) {
		super();
		this.id = id;
		this.specializationCode = specializationCode;
		this.name = name;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpecializationCode() {
		return specializationCode;
	}

	public void setSpecializationCode(String specializationCode) {
		this.specializationCode = specializationCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
