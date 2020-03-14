package com.singleton;

public class Singleton {
	
	public static void main(String[] args) {
		
		
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Test t11=Test.getInstance();
				
			}
		});
		
        Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Test t12=Test.getInstance();
				
			}
		});
		
		
		t1.start();
		t2.start();
	     //So when we create two threads the chances are very high that both the threads may enter
		//the getInstance area at he same time so just to avoid this we will be using the 
		//Either synchronized method or Synchronized block.
		
	}

}

class Test
{
	public static Test test;
	
	private Test() //calling constructor two times means trying to create the object two times.
	{
		System.out.println("Constructor Called..");
	}
	
	public static Test getInstance()
	{
		
		synchronized (Test.class) {
			if(test==null)
			{
			test=new  Test();
			}
			
		}
		
		return test;
	}
}
