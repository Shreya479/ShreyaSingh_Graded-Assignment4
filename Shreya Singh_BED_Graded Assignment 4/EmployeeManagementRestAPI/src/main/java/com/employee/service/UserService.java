package com.employee.service;
import org.springframework.stereotype.Service;

import com.employee.model.User;
import com.employee.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	public UserService(UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}
	public User AddUser(User user)
	{
		return this.userRepository.save(user);
	}

}

