package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Modul {
	@Id
	private int moduleId;
	private String moduleName;
	private String title;

	@OneToOne
	@JoinColumn(name = "project_fk")
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Modul() {
		super();
	}

	public Modul(int moduleId, String moduleName, String title) {
		super();
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.title = title;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Modul [moduleId=" + moduleId + ", moduleName=" + moduleName + ", title=" + title + ", project="
				+ project + "]";
	}

}
