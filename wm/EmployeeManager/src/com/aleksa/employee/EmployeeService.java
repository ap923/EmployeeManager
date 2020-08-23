package com.aleksa.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {
	@Autowired
	EmployeeRepository repo;

	// Method for listing all employees from db
	public List<Employee> listAll() {
		return (List<Employee>) repo.findAll();
	}

}
