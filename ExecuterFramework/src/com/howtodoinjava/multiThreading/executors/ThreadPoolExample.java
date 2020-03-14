package com.howtodoinjava.multiThreading.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class ThreadPoolExample {
    public static void main(String args[]) {
       ExecutorService service = Executors.newFixedThreadPool(10); //create 10 worker threads in Thread Pool
       for (int i =0; i<100; i++){
           service.submit(new Task(i)); //submit that to be done 
       }
       
       
       
       ExecutorService executorService=Executors.newFixedThreadPool(10);
       
  
       
       executorService.execute(new Runnable() {
		public void run() {
			
			System.out.println("Asynchronous Service");
			
		}
	});
       
       Executor ex1=Executors.newFixedThreadPool(12);
       ex1.execute(new Runnable() {
		public void run() {
			
			System.out.println(Thread.currentThread().getName());
			
		}
	});
       
       ScheduledExecutorService ex2=Executors.newScheduledThreadPool(12);
       ex2.execute(new Runnable() {
		public void run() {
			
		}
	});
       
    }  
}

final class Task implements Runnable {
    private int taskId;  
    public Task(int id){
        this.taskId = id;
    }

    @Override
    public void run() {
       // System.out.println("Task ID : " + this.taskId +" performed by " 
                          // + Thread.currentThread().getName());
    }  
}