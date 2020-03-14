package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListProject1 {
	
	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(12, "Anshu", "Mishra", 10000));
		list.add(new Employee(13, "Ravi", "Sharma", 110000));
		list.add(new Employee(132, "Shikha", "Aggrawal", 20000));
		list.add(new Employee(121, "Chandan", "Roy", 30000));
		list.add(new Employee(2, "Rakhi", "Chopra", 40000));
		
		
		
		Comparator<Employee> comp=new Comparator<Employee>() {
			
			
			
			public int compare(Employee e1,Employee e2)
			{
				  
				//String n1=e1.getFirstName();
				//String n2=e2.getFirstName();
				
				//return n1.compareTo(n2);
				
				return e1.getFirstName().compareTo(e2.getFirstName());
				//return -e1.getLastName().compareTo(e2.getLastName());
				
			}
		};
		
		//Comparator object can be called as below mentioned ways.
		
		//Way 1
		//Collections.sort(list, comp);
		
		
		//Way 2
		Collections.sort(list, new MyComparator1());
		
		for(Employee e1:list)
		{
			if(e1.getSalary()>30000)
			{
				//System.out.println(e1.getFirstName());
			}
			
			System.out.println(e1);
		}
	
	}

}



class MyComparator1 implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		
		String fn1=e1.getFirstName();
		String fn2=e2.getFirstName();
		
		return fn1.compareTo(fn2);
		
		
	}
}


class MyComparator implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		int sid1=e1.getId();
		int sid2=e2.getId();
		
		if(sid1<sid2)
		{
			return 1;
		}
		else if(sid1>sid2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
		
	}
}

class Employee 
{
	int id;
	String firstName;
	String lastName;
	int salary;
	
	
	
	public Employee(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	
	
	
}
