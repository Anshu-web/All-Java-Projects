package com.exception;

public class ThrowException {
	
	
	public static void main(String[] args) {
		
		int age=19;
		
		if(age>18)
		{
			System.out.println("Eligible");
		}
		
		else if(age<18)
		{
			throw new IllegalArgumentException("Please pass valid age");
		}
		
		
		
	}

}
