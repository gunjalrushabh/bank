package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("emp/")
public class EmplController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping()
	public String GetAllEmployees() {
		System.out.println("inside Employee Controller.");
		List<Employee>mylist = service.showAll();
		return "showing all Employees";
	}

}
