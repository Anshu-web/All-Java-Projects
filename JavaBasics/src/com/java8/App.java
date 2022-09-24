package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class App {
	
	
	int id;
	String name;
	double salary;
	
	

	public static void main(String[] args) {
		
		
		Department hr = new Department("hr", 1231);
		
		
		Department it = new Department("it", 10);
		Department acc = new Department("admin1", 11);
		Department admin = new Department("acc", 134);
		

		Employee emp1 = new Employee("Anshu", 30, "Noida", 2034, hr);
		Employee emp2 = new Employee("Rahul", 34, "UK", 30033, it);
		Employee emp3 = new Employee("Rishi", 36, "UK", 40056, acc);
		Employee emp4 = new Employee("Ankit", 38, "UK", 50001, admin);

		List<Employee> emplist = new ArrayList<>();
		List<Employee> li=List.of(new Employee("Ankit", 38, "UK", 50001, admin));

		emplist.add(emp4);
		emplist.add(emp3);
		emplist.add(emp2);
		emplist.add(emp1);

		System.out.println("1st");
		
		// print the employee with third lowest salary
		
	//	emplist.stream().map(e->e.getSalary()).limit(3).forEach(System.out::printlns);

		// get all employees having city name starting with N

		emplist.stream().filter(e -> e.getCity().startsWith("N")).map(Employee::getName)

				.forEach(System.out::println);

		System.out.println(emplist.stream().collect(Collectors.groupingBy(Employee::getSalary)));
		/*
		 * Map<Object, Object> topEmployees = emplist.stream()
		 * .collect(Collectors.toMap( e -> e.department, e -> e,
		 * BinaryOperator.maxBy(Comparator.comparingInt(e -> e.salary)) ));
		 */
		
		//topEmployees.entrySet().stream().forEach(System.out::println);

		
		// return max no. of employee in any department
		
		emplist.stream().map(e -> e.getDepartment().getNoOfEmployees()).reduce(Integer::max)
				.ifPresent(System.out::println);

		// Find all employees who lives in ‘UK’ city, sort them by their name and print
		// the names of employees.

		emplist.stream().filter(e -> e.getCity().equalsIgnoreCase("UK")).sorted(Comparator.comparing(Employee::getName))
				.map(Employee::getName).forEach(System.out::println);

		// Find distinct department names that employees work for.

		emplist.stream().map(e -> e.getDepartment().departmentName).distinct().forEach(System.out::println);

		// Find the department names that these employees work for, where the number of
		// employees in the department is over 50.
		System.out.println("======================");

		emplist.stream().filter(e -> e.getDepartment().getNoOfEmployees() > 50)
				.map(e -> e.getDepartment().getDepartmentName()).forEach(System.out::println);

		// Are there any employees from HR Department?

		if (emplist.stream().anyMatch(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))) {
			System.out.println("Employees found in hr department ");
		} else {
			System.out.println("Employees not found in hr department ");

		}

		// Print all employee’s name who are working for account department.

		emplist.stream().filter(e -> e.getDepartment().getDepartmentName().equals("acc")).map(Employee::getName)
				.forEach(System.out::println);

		System.out.println("2nd");

		emplist.stream().filter(e -> e.getSalary() > 30000).forEach(System.out::println);

		System.out.println("3rd");

		emplist.stream().filter(sal -> sal.getSalary() > 50000).map(Employee::getName).forEach(System.out::println);

		System.out.println("4th");

		List<Employee> list = emplist.stream().filter(e -> e.getSalary() % 2 == 0).collect(Collectors.toList());

		for (Employee em : list) {
			double sal = em.getSalary();
			System.out.println("Even salary  " + sal);
		}
		System.out.println("===========================");

		System.out.println("5th");

		emplist.stream().map(Employee::getSalary).forEach(System.out::println);

		System.out.println("===========================");

		System.out.println("6th");

		emplist.stream().filter(e -> e.getSalary() > 30000).map(Employee::getName).forEach(System.out::println);

		// emplist.stream().map(Employee::getName).filter(e -> e.getSalary() >
		// 30000).forEach(System.out::println);

		System.out.println("7th");

		boolean r = emplist.stream().anyMatch(e -> e.getDepartment().departmentName.equalsIgnoreCase("ity"));

		System.out.println(r);
		// Find the total number of employees in all the departments.

		System.out.println("8th");

		emplist.stream().map(e -> e.getDepartment().getNoOfEmployees()).reduce(Integer::sum)
				.ifPresent(System.out::println);

		// Find the department which has the highest number of employees.

		System.out.println("===========================");
		System.out.println("9th");

		emplist.stream().map(e -> e.getDepartment())
				.reduce((d1, d2) -> d1.getNoOfEmployees() > d2.getNoOfEmployees() ? d1 : d2)
				.ifPresent(System.out::println);

		// What is the highest number of of employees in all departments?

		System.out.println("10th");

		emplist.stream().map(e -> e.getDepartment().noOfEmployees).reduce(Integer::max).ifPresent(System.out::println);

	}

}
