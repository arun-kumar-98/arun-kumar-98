package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Specialization {

	@Id
	private Integer specId;
	private String specCode;
	private String specName;
	private String note;

	public Specialization(Integer specId, String specCode, String specName, String note) {
		super();
		this.specId = specId;
		this.specCode = specCode;
		this.specName = specName;
		this.note = note;
	}

	public Specialization() {
		super();
	}

	public Integer getSpecId() {
		return specId;
	}

	public void setSpecId(Integer specId) {
		this.specId = specId;
	}

	public String getSpecCode() {
		return specCode;
	}

	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
