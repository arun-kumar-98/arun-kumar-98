package com.main.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/hello")
	public String getUser(@RequestParam String name) {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		return "Hello  " + authentication.getName();
	}

}
