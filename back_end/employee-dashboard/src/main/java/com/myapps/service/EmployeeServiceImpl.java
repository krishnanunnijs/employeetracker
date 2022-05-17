package com.myapps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapps.model.Employee;
import com.myapps.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public boolean saveEmployee(Employee employee) {
		return (null != employeeRepo.save(employee)) ? true : false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(Long empId) {
		return employeeRepo.findById(empId);
	}

}
