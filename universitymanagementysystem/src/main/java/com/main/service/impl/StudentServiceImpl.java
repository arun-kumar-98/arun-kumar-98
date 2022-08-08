package com.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.dao.StudentDao;
import com.main.entity.Student;
import com.main.service.IStudentService;

@Repository
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {

		return studentDao.save(student);
	}

	@Override
	public List<Student> list() {
		List<Student> students;
		students = studentDao.findAll();
		if (students.size() > 0) {
			return students;
		}
		return new ArrayList<>();
	}

}
