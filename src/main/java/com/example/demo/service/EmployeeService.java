package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepsitory;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepsitory employeeRepsitory;
	
	public Employee saveEmployee(Employee employee) {
		 return employeeRepsitory.save(employee);
	}

}
