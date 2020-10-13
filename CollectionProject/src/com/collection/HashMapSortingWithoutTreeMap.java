package com.collection;


 import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
 import java.util.Map.Entry;
import java.util.TreeMap;
 
public class HashMapSortingWithoutTreeMap {


	public static void main(String[] args) {
		
	 
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
			
			 
		}
		 
	}
	
	
	
}

class Emp1
{
	int id;
	String name;
	public Emp1(int id, String name) {
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

 	 