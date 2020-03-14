package com.springboothibernate.dao;

import java.util.List;

import com.springboothibernate.model.Employee;
 
public interface EmployeeDao {
	
	List<Employee> getAll();
	
	Employee getOneEmployee(int id);
	
	void deleteById(int id);
	
	void saveEmployee(Employee employee);

}
