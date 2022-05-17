package com.myapps.service;

import java.util.List;
import java.util.Optional;

import com.myapps.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee);

	public List<Employee> getAllEmployees();
	
	public Optional<Employee> getEmployee(Long empId);

}
