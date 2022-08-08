package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer projId;
	private String projName;
	private Integer duration;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mod_fk")
	private Modul modul;

	public Project() {
		super();
	}

	public Project(Integer projId, String projName, Integer duration, Modul modul) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.duration = duration;
		this.modul = modul;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Modul getModul() {
		return modul;
	}

	public void setModul(Modul modul) {
		this.modul = modul;
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", duration=" + duration + "]";
	}

}
