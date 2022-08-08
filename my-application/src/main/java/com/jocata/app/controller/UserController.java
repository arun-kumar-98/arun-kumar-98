/**
 * 
 */
package com.jocata.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jocata.app.Exceptions.UserException;
import com.jocata.app.dao.impl.UserDetailDaoImpl;
import com.jocata.app.entity.UserDetail;
import com.jocata.app.service.UserDetailService;

/**
 * @author Rajeev
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserDetailService userDetailService;
	
	
	@PostMapping("/saveUser")
	public ResponseEntity<String> saveUser(@RequestBody UserDetail userDetail){
		return ResponseEntity.ok(userDetailService.saveUser(userDetail));
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<UserDetail>> getAllUser(){
		return ResponseEntity.ok(userDetailService.getAllUser());
	}
	@GetMapping("/getUserById/{id}")
	public ResponseEntity<UserDetail> getUserById(@PathVariable("id") Long id) throws UserException {
		return ResponseEntity.ok(userDetailService.getUserById(id));
		
	}
	@DeleteMapping("/deleteUserById/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id) {
		return ResponseEntity.ok(userDetailService.deleteUser(id));
		
	}
}
 