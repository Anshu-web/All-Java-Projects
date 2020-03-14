package com.concurrent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 extends Thread{
	
	//static ConcurrentHashMap<Integer, String> chm=new ConcurrentHashMap<Integer, String>();
	
	static HashMap<Integer, String> chm=new HashMap<Integer, String>(); //In this case we will get Concurrentmodificationexception
	
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Child thread executing..");
		
		chm.put(121, "Welcome");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> list=new ArrayList<Integer>();
		
		
		list.add(121);
		list.add(122);
		list.add(123);
		list.add(124);
		
		list.remove(new Integer(122));
		
		//System.out.println(list);
		
		
		System.out.println("==================");
		
		
		
		chm.put(112, "Hello");
		chm.put(113, "Everyone");
		
		ConcurrentHashMap1 t1=new ConcurrentHashMap1();
		
		t1.start();
		
		Iterator itr=chm.entrySet().iterator();
		
		while(itr.hasNext())
		{
		Entry<Integer, String>	entry=(Entry<Integer, String>) itr.next();
		
		 System.out.println(entry.getKey()+" "+entry.getValue());
		 
		 Thread.sleep(3000);
		}
	}

}
