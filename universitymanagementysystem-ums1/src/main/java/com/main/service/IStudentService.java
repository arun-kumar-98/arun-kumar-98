package com.main.service;

import java.util.List;

import com.main.entity.Student;

public interface IStudentService {
	public String save(Student student);

	public List<Student> studentAll();

	public Student getStd(Integer id);

	public void removeStd(Integer id);

}
