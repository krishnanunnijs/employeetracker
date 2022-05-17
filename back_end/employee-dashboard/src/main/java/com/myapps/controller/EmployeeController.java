package com.myapps.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myapps.model.Employee;
import com.myapps.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeService.getAllEmployees();
	}
	
	@GetMapping("/{employeeId}")
	public Employee getEmploye(@PathParam("employeeId") Long employeeId) {
		Employee em = new Employee();
		Optional<Employee> emp = employeeService.getEmployee(employeeId);
		if(emp.isPresent()) {
			em = emp.get();
		}
		return em;
	}

	@PostMapping("/saveEmployee")
	void addUser(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}
}
