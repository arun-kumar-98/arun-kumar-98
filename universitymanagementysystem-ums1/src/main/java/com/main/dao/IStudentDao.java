package com.main.dao;

import java.util.List;

import com.main.entity.Student;

public interface IStudentDao {
	public String saveStudent(Student student);

	public List<Student> getAllStudent();

	public Student getStudentById(Integer id);

	public String deleteStudent(Integer id);

}
