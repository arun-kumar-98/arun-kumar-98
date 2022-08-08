package com.main.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "university")
public class University {

	private static final long serialVersionUID = 1L;

	@Id
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	private String dept;

	public University(Integer uid, String dept) {
		super();
		this.uid = uid;
		this.dept = dept;
	}

	public University() {
		super();
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// map student entity with university entity
	/*
	 * @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "uidfk") private List<Student> student;
	 * 
	 * public University(Integer uid, String dept, List<Student> student) { super();
	 * this.uid = uid; this.dept = dept; this.student = student; }
	 * 
	 * public University() { super(); }
	 * 
	 * public Integer getUid() { return uid; }
	 * 
	 * public void setUid(Integer uid) { this.uid = uid; }
	 * 
	 * public String getDept() { return dept; }
	 * 
	 * public void setDept(String dept) { this.dept = dept; }
	 * 
	 * public List<Student> getStudent() { return student; }
	 * 
	 * public void setStudent(List<Student> student) { this.student = student; }
	 * 
	 * public static long getSerialversionuid() { return serialVersionUID; }
	 */
}
