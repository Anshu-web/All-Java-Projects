package com.springboothibernate.service;

import java.util.List;

import com.springboothibernate.model.Employee;
 
public interface EmploeeService {

	
	List<Employee> getAll();
	
	Employee getOneEmployee(int id);
	
	void deleteById(int id);
	
	void saveEmployee(Employee employee);
}
