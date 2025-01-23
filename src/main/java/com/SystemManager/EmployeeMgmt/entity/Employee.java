package com.SystemManager.EmployeeMgmt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//For Auto generated ID
	Long id;

    String name;
	String address;
	String email;
	String dept;
	Long contact;
	Long payroll;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Long getContact() {
		return contact;	
	}
	
	public void setContact(Long contact) {
		this.contact = contact;
	}
	
	
	public Long getPayroll() {
		return payroll;
	}

	public void setPayroll(Long payroll) {
		this.payroll = payroll;
	}
	
}
