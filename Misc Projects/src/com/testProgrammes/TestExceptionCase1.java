package com.testProgrammes;

public class TestExceptionCase1 {
	
	
	
	
	public static void main(String[] args) {
		
		new Test();
		
		int x=10;
		int y=10;
		int rem=0;
		
		try {
			rem=x/y;
			
			System.out.println("Hello");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		 
		
		finally {
			System.out.println("Finally executed");
		}
		 
	}

}

class Test
{
	Double x;
	Test()
	{
		this.x=x;
	}
}
