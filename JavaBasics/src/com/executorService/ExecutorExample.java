package com.executorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService service=Executors.newFixedThreadPool(10);
		Future<String> future=service.submit(()->{
			
			try {
				Thread.sleep(10000);				
				
			} catch (InterruptedException e) {
				e.getStackTrace();				 
			}
			return "completed ";
			
		});
		
		try {
		while(future.isDone())
		{
			System.out.println("Task is still executing :::");
			
			Thread.sleep(500);
			 
		}
	}catch (Exception e) {
		// TODO: handle exception
	}}
	

}
