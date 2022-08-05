package com.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.main.entity.Company;
import com.main.service.ICompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {
	@Autowired
	private ICompanyService companyService;

	@PostMapping("/save")
	@ResponseStatus(code = HttpStatus.CREATED, reason = "new record is created")
	public ResponseEntity<Company> setDetails(@Valid @RequestBody Company company) {
		return ResponseEntity.status(201).body(companyService.saveComp(company));
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Company>> getAll() {
		return ResponseEntity.ok(companyService.getAllRecords());
	}

	@PostMapping("update/{id}")
	public ResponseEntity<Company> updateNewRecord(@PathVariable Long id, @Valid @RequestBody Company company) {
		return ResponseEntity.ok(companyService.update(id, company));
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Company> discardLincense(@PathVariable Long id) {
		return ResponseEntity.ok(companyService.removeOneRecord(id));
	}

}
