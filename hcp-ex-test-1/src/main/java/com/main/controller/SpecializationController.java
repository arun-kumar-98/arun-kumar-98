package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.entity.Specialization;
import com.main.service.ISpecializationService;

@Controller
@RequestMapping("/specialization")
public class SpecializationController {

	@Autowired
	private ISpecializationService specializationService;

	@GetMapping("/getAll")
	public String getRecord(Model model) {
		List<Specialization> list = specializationService.getSpecialization();
		model.addAttribute("list", list);
		return "specializationData";
	}

}
