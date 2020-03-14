package com.springboothibernate.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboothibernate.model.Employee;
import com.springboothibernate.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/rest/api")
public class EmployeeController {

 
	@Autowired
	private EmployeeServiceImpl emplServiceImpl;


	// @RequestMapping(name="/getAll", method = RequestMethod.GET)
	@GetMapping("/get/employees")

	public List<Employee> getEmployees() {
		return emplServiceImpl.getAll();
	}

	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		emplServiceImpl.saveEmployee(employee);

		return employee;
	}

	@DeleteMapping("/delete/{id}")
	//@RequestMapping(name = "/delete/{id}",method = RequestMethod.DELETE)
	public String deleteEmploye(@PathVariable int id) {
		
		 
		emplServiceImpl.deleteById(id);
		return "Successfully Deleted " + id;
	}

	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable int id) {
		Employee employeeobj = emplServiceImpl.getOneEmployee(id);

		if (employeeobj == null) {
			throw new RuntimeException("Employee was not found with id " + id);
		}

		else {
			return employeeobj;
		}
	}

	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employeeobj) {
		emplServiceImpl.saveEmployee(employeeobj);
		return employeeobj;

	}

}
