package com.java.equalsandhashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Employee emp1 = new Employee(121, "Shiva");

		Employee emp2 = new Employee(121, "Shiva");
		Employee emp3 = new Employee(111, "Rahul");
		Employee emp4 = new Employee(101, "Rakesh");
		Employee emp5 = new Employee(131, "Kareena");
		Employee emp6=emp1;
		
		System.out.println(emp1.equals(emp2));
		

		 System.out.println("Printing the employee objects from hashset");
		 
		 Set<Employee> empSet=new HashSet<>();
		 empSet.add(emp1);
		 empSet.add(emp2);
		 empSet.add(emp3);
		 empSet.add(emp4);
		 empSet.add(emp5);
		 
		 System.out.println(empSet.size());
		 
		 for(Employee emp:empSet)
		 {
			 System.out.println(emp);
		 }
		 
		 System.out.println("Printing the employee objects from hashMap");
		 
		 
		 Map<Employee, String> empMap=new HashMap<>();
		 
		 empMap.put(emp1, "India");
		 empMap.put(emp2, "Japan");
		 empMap.put(emp3, "China");
		 empMap.put(emp4, "USA");
		 
		 System.out.println(empMap.size());
		 
		 for(Map.Entry entry:empMap.entrySet())
		 {
			 System.out.println("Key is "+entry.getKey()+" "+"==Value is "+entry.getValue());
		 }
		 
	}

}
