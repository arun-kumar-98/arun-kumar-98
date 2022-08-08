package com.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.IStudentDao;
import com.main.entity.Student;
import com.main.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;

	@Transactional
	@Override
	public Student getStd(Integer id) {
		return dao.getStudentById(id);
	}

	@Transactional
	@Override
	public void removeStd(Integer id) {
		dao.deleteStudent(id);

	}

	@Transactional
	@Override
	public String save(Student student) {

		return dao.saveStudent(student);
	}

	@Transactional
	@Override
	public List<Student> studentAll() {
		List<Student> list = dao.getAllStudent();
		if (list.size() > 0) {
			return list;
		} else
			return new ArrayList<>();
	}
}
