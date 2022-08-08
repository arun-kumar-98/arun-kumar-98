package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specification {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long specid;

	private String specializationcode;

	private String specializationname;

	private String Specializationnote;

	public Specification() {
		super();
	}

	public Specification(Long specid, String specializationcode, String specializationname, String specializationnote) {
		super();
		this.specid = specid;
		this.specializationcode = specializationcode;
		this.specializationname = specializationname;
		Specializationnote = specializationnote;
	}

	public Long getSpecid() {
		return specid;
	}

	public void setSpecid(Long specid) {
		this.specid = specid;
	}

	public String getSpecializationcode() {
		return specializationcode;
	}

	public void setSpecializationcode(String specializationcode) {
		this.specializationcode = specializationcode;
	}

	public String getSpecializationname() {
		return specializationname;
	}

	public void setSpecializationname(String specializationname) {
		this.specializationname = specializationname;
	}

	public String getSpecializationnote() {
		return Specializationnote;
	}

	public void setSpecializationnote(String specializationnote) {
		Specializationnote = specializationnote;
	}

}
