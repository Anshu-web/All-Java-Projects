package com.java8;

public final class Employee {
	
	private final String name;
	int age;
	String city;
	double salary;
	Department department;



	
	public Employee(String name, int age, String city, double salary, Department department) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.department = department;
	}
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + ", salary=" + salary + ", department="
				+ department + "]";
	}

 
	
	
	

}
