package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/")
	public String home() {
		return ("<h1>home page</h1>");
	}

	@GetMapping("/user")
	public String user() {
		return ("<h1>USER page</h1>");
	}

	@GetMapping("/admin")
	public String admin() {
		return ("<h1>ADMIN page</h1>");
	}
}
