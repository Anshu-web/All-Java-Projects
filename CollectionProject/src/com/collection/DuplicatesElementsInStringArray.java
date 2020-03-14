package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesElementsInStringArray {
	
	public static void main(String[] args) {
		
	ArrayList<String> list =  new ArrayList<>();
	
	list.add("stack");
	list.add("overflow");
	list.add("stack");
	list.add("yahoo");
	list.add("google");
	list.add("MSN");
	list.add("stack");
	list.add("overflow");
	list.add("user");
 
	
	
	 String[] listofarray={"stack", "overflow", "stack", 
		        "yahoo", "google", "msn", 
		        "MSN", "stack", "overflow", "user" };
		
		
		Map<String, Integer> map=new HashMap<>();
		
		for(String e:list)
		{
			 
			if(map.containsKey(e))
			{
				map.put(e, map.get(e)+1);
			}
			else
			{
				map.put(e, 1);
			}
		}
		
		for(Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}
		
		System.out.println("=======================================");
		
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			String value=(String) itr.next();
			
			System.out.println(value);
		}
		
		 
	}

}


	
