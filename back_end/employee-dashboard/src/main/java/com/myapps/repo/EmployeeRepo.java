package com.myapps.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myapps.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
