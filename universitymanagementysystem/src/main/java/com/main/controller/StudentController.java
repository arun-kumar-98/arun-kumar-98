package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Student;
import com.main.service.IStudentService;

@RestController
@RequestMapping("/std")
public class StudentController {

	@Autowired
	private IStudentService studentService;

	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStd(@RequestBody Student student) {
		return ResponseEntity.ok(studentService.saveStudent(student));
	}

	@GetMapping("all")
	public @ResponseBody ResponseEntity<List<Student>> getAll(@RequestBody Student student) {
		return ResponseEntity.ok(studentService.list());

	}

}
