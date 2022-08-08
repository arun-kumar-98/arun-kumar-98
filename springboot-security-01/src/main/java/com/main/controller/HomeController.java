package com.main.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@PostMapping("/security")
	public String home() {
		return "welcome to spring security course";
	}

	@PostMapping("/welcome")
	public String welcome() {
		return "welcome to spring security course";
	}

	@PostMapping("/admin")
	public String admin() {
		return "welcome to spring security course";
	}

	@PostMapping("/secu")
	public String sec() {
		return "welcome to spring security course";
	}

}
