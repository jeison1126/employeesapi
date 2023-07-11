package com.emp.service;

import org.springframework.http.ResponseEntity;

public interface EmployeeService {
	
	public String getEmployee();
	
	public String employeePorId(Integer idEmployee);
	

}
