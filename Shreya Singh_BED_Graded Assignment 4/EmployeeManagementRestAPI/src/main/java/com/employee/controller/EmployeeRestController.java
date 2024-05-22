package com.employee.controller;

import java.util.*;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.employee.model.*;
import com.employee.service.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	private final RoleService roleService;
	private final UserService userService;
	public EmployeeRestController(EmployeeService employeeService, RoleService roleService, UserService userService)
	{
		this.employeeService=employeeService;
		this.roleService = roleService;
		this.userService=userService;
	}
	@GetMapping
	public Set<Employee> fetchAllEmployees()
	{
		return this.employeeService.fetchAllEmployees();
	}
	@GetMapping("/{id}")
	public Employee fetchById(@PathVariable("id") long employeeId)
	{
		return this.employeeService.fetchById(employeeId);
	}
	@PostMapping
	public Employee save(@RequestBody Employee employee)
	{
		return this.employeeService.AddEmployee(employee);
	}
	@PostMapping("/setRoles")
	public Role save(@RequestBody Role role)
	{
		return this.roleService.AddRole(role);
	}
	@PostMapping("/setUser")
	public User save(@RequestBody User user)
	{
		return this.userService.AddUser(user);
	}
	@GetMapping("/fetchRoles")
	public Set<Role> fetchAllRoles()
	{
		return this.roleService.fetchAllRoles();
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") long employeeId)
	{
		this.employeeService.deleteById(employeeId);
	}
	
	@Transactional
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable("id") long employeeId, @RequestBody Employee employee) {
		return this.employeeService.updateEmployee(employeeId,employee);
	}
	@GetMapping("/search/{id}")
	public Set<Employee> fetchByFirstname(@PathVariable("id") String search) {
		return this.employeeService.FetchByFirstname(search);
	}
	@GetMapping("/sort")
	public List<Employee> fetchAllEmployeesByFirstname(
	@RequestParam(name="order") String order)
	{
		return this.employeeService.fetchAllEmployeesByFirstname(order);
	}
	
}	


