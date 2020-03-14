package com.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesInString {
	
	 static int count=0;
	
	public static void main(String[] args) {
		
		String s="Happy Birthday to you happy birthday to ABC happy birthday to XYZ";
		
		String [] str=s.split(" ");
		
		HashMap<String, Integer> map=new HashMap<>();
		
		map.put("Anshu", null);
		//map.put("Anshu", 12);
		map.put("Anshu", 12);
		map.put("Anshu", 13);
		map.put(null, 12);
		//map.put(null, null);
		
		System.out.println(map);
		 
		
		Map<Integer, String> table=new Hashtable<>();
		table.put(11, "A");
		table.put(12, "A");
		table.put(null, "B");
		table.put(111, null);
		 
		System.out.println(table.size());
		 System.out.println(table);
		 
	 
		 
		 //hasmap.put(12, "B");
		 
		 System.out.println("============================");
		
		for(String sr:str)
		{
			if(map.containsKey(sr))
			{
				map.put(sr, map.get(sr)+1);
				
				count++;
			}
			else
			{
				map.put(sr, 1);
			}
		}
		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1) {
				
				//System.out.println(entry.getKey());
			}
			
			// System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
