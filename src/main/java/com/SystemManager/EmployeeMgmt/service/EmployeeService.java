package com.SystemManager.EmployeeMgmt.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SystemManager.EmployeeMgmt.entity.Employee;
import com.SystemManager.EmployeeMgmt.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	//For POST mapping
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

    //for Get mapping
	
	public Optional<Employee> getEmployeeDetails(Long id) {
		
		return employeeRepository.findById(id);
	}

	

}
