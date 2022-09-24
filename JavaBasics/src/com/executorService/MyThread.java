package com.executorService;

public class MyThread implements Runnable {

	@Override
	public void run() {
		 
		try {
			Thread.sleep(10000);
			
			System.out.println("Task Completed ");
		} catch (InterruptedException e) {
			e.getStackTrace();
			e.printStackTrace();
		}
		
	}
	
	

}
