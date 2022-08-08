package com.main.service;

import java.util.List;

import com.main.entity.Student;

public interface IStudentService {

	Student saveStudent(Student student);

	List<Student> list();

}
