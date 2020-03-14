package com.java.equalsandhashcode;

public class Employee {

	private int id;

	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + id; result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); return result; }
	 * 
	 * @Override public boolean equals(Object obj) {
	 * 
	 * if (this == obj) { return true; } if (obj == null) { return false; }
	 * 
	 * if (this.getClass() != obj.getClass()) { return false; }
	 * 
	 * Employee employee = (Employee) obj; if (this.id != employee.id) { return
	 * false; } if (this.name == null) {
	 * 
	 * if (employee.name != null) { return false; } } if
	 * (!this.name.equals(employee.name)) { return false; } return true; }
	 */

	@Override public boolean equals(Object obj) { 
		// TODO Auto-generated method
	return true; }

	@Override public int hashCode()
	{ // TODO Auto-generated method stub
		return id; }

}
