package com.employee.service;
import java.util.*;
import org.springframework.stereotype.Service;

import com.employee.model.Role;
import com.employee.repository.RoleRepository;

@Service
public class RoleService {
	
	private final RoleRepository roleRepository;
	public RoleService(RoleRepository roleRepository)
	{
		this.roleRepository=roleRepository;
	}
	public Role AddRole(Role role)
	{
		return this.roleRepository.save(role);
	}
	public Set<Role> fetchAllRoles()
	{
		return new HashSet<>(this.roleRepository.findAll());
	}

}

