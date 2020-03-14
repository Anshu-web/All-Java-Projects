package com.springboothibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboothibernate.dao.EmployeeDao;
import com.springboothibernate.dao.EmployeeDaoImpl;
import com.springboothibernate.model.Employee;
 
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeDao {
	
	
	@Autowired
	EmployeeDaoImpl employeedaoimpl;

	
	@Override
	@Cacheable(value="geAll")
	public List<Employee> getAll() {
		
		return employeedaoimpl.getAll();
		 	 
	}

	@Override
	public Employee getOneEmployee(int id) {
	return	employeedaoimpl.getOneEmployee(id);
	 
	}

	@Override
	public void deleteById(int id) {
     employeedaoimpl.deleteById(id);		
	}

	@Override
	public void saveEmployee(Employee employee) {
		 
		employeedaoimpl.saveEmployee(employee);
	 
	}

	 

}
