package com.main.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.common.UserConstant;
import com.main.model.User;
import com.main.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository repository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@PostMapping("/join")
	public String joinGroup(@RequestBody User user) {

		user.setRoles(UserConstant.DEFAULT_ROLE);
		String encryptedPwd = passwordEncoder.encode(user.getPassword());
		user.setPassword(encryptedPwd);

		repository.save(user);

		return "Hi  " + user.getUsername() + "  welcome to group";
	}

	@GetMapping("/access/{id}/{role}")
	@PreAuthorize("hasAuthority('ROLE_ADMIN') or hasAuthority('ROLE_MODERATOR')")
	public String giveAccessToUser(@PathVariable Integer id, @PathVariable String role, Principal principal) {
		User user = repository.findById(id).get();
		List<String> activeRoles = getRolesByLoggedInUser(principal);

		String newRole = "";
		if (activeRoles.contains(role)) {
			newRole = user.getRoles() + "," + newRole;
			user.setRoles(newRole);

		}
		repository.save(user);

		return "Hi " + user.getUsername() + " new role assign to you by " + principal.getName() + " " + newRole;
	}

	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<User> loadAllUser() {
		return repository.findAll();
	}

	@GetMapping("/test")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String testUserAccess() {
		return "user can only access this!";
	}

	private User getLoggedInUser(Principal principal) {
		return repository.findByUsername(principal.getName()).get();
	}

	private List<String> getRolesByLoggedInUser(Principal principal) {
		String roles = getLoggedInUser(principal).getRoles();
		List<String> assignRoles = Arrays.stream(roles.split(",")).collect(Collectors.toList());

		if (assignRoles.contains(UserConstant.ADMIN_ACCESS)) {
			return Arrays.stream(UserConstant.ADMIN_ACCESS).collect(Collectors.toList());
		}

		if (assignRoles.contains(UserConstant.MODERATOR_ACCESS)) {
			return Arrays.stream(UserConstant.MODERATOR_ACCESS).collect(Collectors.toList());
		}

		return Collections.EMPTY_LIST;
	}

}
