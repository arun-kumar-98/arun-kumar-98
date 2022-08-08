package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course {
	@Id
	private int id;
	private String course;
	@ManyToOne
	private Student student;

	public Course() {
		super();
	}

	public Course(Integer id, String course, Student student) {
		super();
		this.id = id;
		this.course = course;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", student=" + student + "]";
	}

}
