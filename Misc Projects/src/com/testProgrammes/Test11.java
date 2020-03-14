package com.testProgrammes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test11  {

	public static void main(String[] args) {
		
		
		Employee e1=new Employee(12,"Anshu");
		Employee e2=new Employee(13,"Rahul");
		Employee e3=new Employee(14,"Shankar");
		Employee e4=new Employee(15,"Kali");
		
	 HashMap<Employee, String> map=new HashMap<>();
	 
	 map.put(e1, "IT");
	 map.put(e2, "Testing");
	 map.put(e3, "Dev");
	 map.put(e4, "Finance");
	
	 //============================Sorting of normal Hashmap=========================
	 
	HashMap<String, Integer> hm=new HashMap<>();
	
	hm.put("one", 1);
	hm.put("two", 2);
	hm.put("three", 3);
	hm.put("four", 4);
	hm.put("five", 5);
	
	List<Entry<String, Integer>> list=new LinkedList<Entry<String,Integer>>(hm.entrySet());
	
	Collections.sort(list, new Comparator<Entry<String, Integer>>() {

	 

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			 
			//return o1.getKey().compareTo(o2.getKey());
			
			return o1.getValue().compareTo(o2.getValue());
			
		}
		 
	});
	 
		for(Entry emp:list)
		{
			System.out.println(emp.getKey()+"  "+emp.getValue());
			
			//System.out.println("===============================");
			
			//System.out.println(emp.getKey());
		}
	}
	
}


class MyComparator1 implements Comparator<Employee>
{
	 

	@Override
	public int compare(Employee arg0, Employee arg1) {
		Employee name1=(Employee) arg0;
		Employee name2=(Employee) arg1;
		
		return name1.getName().compareTo(name2.getName());
		 
	}
}



class Employee
{
	int id;
	String name;
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
	
	
}

 	 
