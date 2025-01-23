package com.SystemManager.EmployeeMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SystemManager.EmployeeMgmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
	
}
