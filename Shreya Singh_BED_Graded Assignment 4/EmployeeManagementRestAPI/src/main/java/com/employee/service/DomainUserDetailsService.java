package com.employee.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.employee.model.*;
import com.employee.repository.UserRepository;

@Service
public class DomainUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = this.userRepository.findByUsername(username);
		
		if (optionalUser.isPresent()) {
			User user =  optionalUser.get();
			System.out.println(optionalUser.get());
			return new DomainUserDetails(user);
			
		}
		throw new UsernameNotFoundException("Wrong credentials");
	}

}