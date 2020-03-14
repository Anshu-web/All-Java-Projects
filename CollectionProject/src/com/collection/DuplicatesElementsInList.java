package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesElementsInList {
	
	public static void main(String[] args) {
		
		List<Emp> list=new ArrayList<Emp>();
		
		list.add(new Emp(12, "Anshu", "Mishra", 10000));
		list.add(new Emp(13, "Ravi", "Sharma", 110000));
		list.add(new Emp(132, "Shikha", "Aggrawal", 20000));
		list.add(new Emp(121, "Chandan", "Roy", 30000));
		list.add(new Emp(2, "Rakhi", "Chopra", 40000));
		list.add(new Emp(2, "Anshu", "Chopra", 40000));
		list.add(new Emp(2, "Anshu", "Chopra", 40000));
		list.add(new Emp(2, "Anshu", "Chopra", 40000));
		list.add(new Emp(2, "Chandan", "Chopra", 40000));
		list.add(new Emp(2, "Rakhi", "Chopra", 40000));
		list.add(new Emp(2, "Rakhi", "Chopra", 40000));

		
		Map<String, Integer> map=new HashMap<>();
		
		for(Emp e:list)
		{
			 
			if(map.containsKey(e.getFirstName()))
			{
				map.put(e.getFirstName(), map.get(e.getFirstName())+1);
			}
			else
			{
				map.put(e.getFirstName(), 1);
			}
		}
		
		for(Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}
		
		//System.out.println(map);
	}

}

class Emp 
{
	int id;
	String firstName;
	String lastName;
	int salary;
	
	
	
	public Emp(int id, String firstName, String lastName, int salary) {
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
	
