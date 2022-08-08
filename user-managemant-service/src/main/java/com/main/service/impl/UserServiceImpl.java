package com.main.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.model.User;
import com.main.repository.IUserRepository;
import com.main.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	@Override
	public User addUser(User user) {
		user.setCreatedOn(new Date());
		user.setUpdatedOn(null);

		return userRepository.save(user);
	}

}
