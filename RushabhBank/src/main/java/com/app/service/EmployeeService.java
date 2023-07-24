package com.app.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> showAll() {
		System.out.println("inside Employee Service.");
		if(repo.count() !=0) {
			return repo.findAll();	
		}
		else {
			System.out.println("No records found in database");
			return null;
		}
		
	}
}
