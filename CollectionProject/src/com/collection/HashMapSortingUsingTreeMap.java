package com.collection;


import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapSortingUsingTreeMap {
	
	public static void main(String[] args) {
		
	 
	 //============================Sorting of normal Hashmap=========================
	 
	HashMap<String, Integer> hm=new HashMap<>();
	
	hm.put("one", 1);
	hm.put("two", 2);
	hm.put("three", 3);
	hm.put("four", 4);
	hm.put("five", 5);
	hm.put("eight", 8);
	hm.put("six", 6);
	hm.put("zero", 0);
	
	 
	 
		System.out.println("===============================");
		
		TreeMap<String, Integer> tree=new TreeMap<>(hm);
		
		//tree.putAll(hm);
		
		for(Entry<String, Integer> entry:tree.entrySet())
		{
		
		System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
	
	
	
}

 
 

	 
