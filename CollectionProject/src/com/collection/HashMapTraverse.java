package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTraverse {
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> map=new HashMap<>();
		
		map.put("Hello", 5);
		map.put("EveryOne", 2);
		map.put("Hi", 2);
		map.put("Welcome", 6);
		map.put("To", 2);
		map.put("Java", 4);
		
		//System.out.println(map);
		
	//=====================Traversing Using Iterator====================================	
		
		Iterator itr=map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			 Entry set=(Entry) itr.next();
			 
			 int value=(int)set.getValue()+10;
			 
			// System.out.println(set.getKey()+" "+value);
		}
		
		//========================Traversing Java 7 forEach===============================
		for(Entry entry:map.entrySet())
		{
			//System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
	//========================= Traversing Java 8 forEach=====================================	
		
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		
	}

}
