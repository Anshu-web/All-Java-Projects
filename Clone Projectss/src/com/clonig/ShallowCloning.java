package com.clonig;

public class ShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Employee emp1=new Employee(121, "Anshu",25, "anshu@gmail.com", "pass@123", null);
		
		System.out.println("Original Content :");
		
		System.out.println(emp1);
		
		System.out.println("Cpoied Content :");
		
		Employee emp2=(Employee) emp1.clone();
		
		// even after doing some changes to the copied object it is not making any change to 
		//original object.
		
		emp2.setId(12121);
		
		System.out.println(emp2);
	}
	

}
