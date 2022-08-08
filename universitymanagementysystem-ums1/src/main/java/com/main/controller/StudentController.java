package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Student;
import com.main.service.IStudentService;

@RestController
@RequestMapping("/project")
public class StudentController {

	@Autowired
	private IStudentService service;

	@PostMapping("/student")
	public ResponseEntity<String> saveStudent(@RequestBody Student student) {

		return ResponseEntity.ok(service.save(student));

	}

	@GetMapping("/getstd")
	public ResponseEntity<List<Student>> studentsList() {
		return ResponseEntity.ok(service.studentAll());
	}

}
