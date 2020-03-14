package com.concurrent;

import java.util.ArrayList;
import java.util.Iterator;


class MyThread1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> l=new ArrayList<>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		MyThread t=new MyThread();
		
		t.start();
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext())
		{
		
				String s1=(String) itr.next();
			
			
			Thread.sleep(3000);
		}	
		System.out.println("Main thread executing");
	}
}

class MyThread extends Thread
{
	static ArrayList list=new ArrayList<>();
	
	public void run()
	{
		try { Thread.sleep(20000);} 
		
		catch (Exception e) {}
		
		System.out.println("Child thread trying to execut....");
		
		list.add("H");
	}
	
}
