package com.clonig;

public class DeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address=new Address(10, "Line1", "Line2", "Mumbai", 201301);
		
		Employee emp=new Employee(12, "Rahul", 34, "anshu@gmail.com", "pass123", address);
		
		
		
		
		
	Employee employee1=(Employee) emp.clone();
	
	employee1.getAddress().setCity("Delhi");
	
	
	System.out.println("Oroginal Content :");
	
	System.out.println(emp);
	
	
	System.out.println("Copied Content :");
	
	System.out.println(employee1);
	}

}
