package com.SystemManager.EmployeeMgmt.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.SystemManager.EmployeeMgmt.entity.Employee;
import com.SystemManager.EmployeeMgmt.service.EmployeeService;


@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee)
	{
	return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/employee")
	
	public Optional<Employee> getEmployeeDetails(@RequestParam Long id)
	{
		return employeeService.getEmployeeDetails(id);
	}
	
	
	
	
	
		
}




