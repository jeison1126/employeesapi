package com.emp.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	public EmployeeService service;
	
	@GetMapping("/employees")
	ResponseEntity<Object> getEmployyee(){
		return new ResponseEntity<>(service.getEmployee(),HttpStatus.OK);
	}
	
	@GetMapping("employee/{employeeId}")
	public ResponseEntity<Object> getEmployeePoID(Integer employeeId) {
		return new ResponseEntity<>(service.employeePorId(employeeId),HttpStatus.OK);
	}


}
