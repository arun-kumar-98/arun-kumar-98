package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.main.entity.Employee;
import com.main.service.IEmployeeService;

@Controller
@RequestMapping("/services")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("/register")
	public String showRegisterPage() {
		return "employee_details";
	}

	@PostMapping("/save")
	public String registerEnoloyee(@ModelAttribute Employee request, Model model) {
		Employee employee = employeeService.addNewEmployee(request);
		String message = "employee created with id :" + employee.getEmpId();
		model.addAttribute("message", message);
		return "employee_details";
	}

	@GetMapping("/getAll")
	public String getAllRecord(Model model, @RequestParam(value = "message", required = false) String message) {

		List<Employee> list = employeeService.getAll();
		model.addAttribute("list", list);
		model.addAttribute("message", message);
		return "employeedata";

	}

	@GetMapping("/delete")
	public String removeRecord(@RequestParam Integer id, RedirectAttributes attributes) {

		employeeService.remove(id);

		attributes.addAttribute("message", "record is (" + id + ") delted ");

		return "redirect:getAll";
	}

	@GetMapping("/update")
	public String updateRecord(@RequestParam Integer id, Model model) {
		Employee employee2 = employeeService.getOne(id);
		model.addAttribute("emp", employee2);
		return "employeeEdit";

	}

}
