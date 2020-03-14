package com.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentCollection1 {
	
	public static void main(String[] args) {
		
		
		ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<>();
		
		chm.put(101, "Anshu");
		chm.put(102, "Shiva");
		chm.put(102, "fghj");
		
		chm.putIfAbsent(1011, "Hello");
		
		//chm.remove(101, "Anshu");
		
		chm.replace(101, "Bravo", "Hi");// If key and value are matched then only replace method works.
		
		System.out.println(chm);
		
		
		
		
	}

}
