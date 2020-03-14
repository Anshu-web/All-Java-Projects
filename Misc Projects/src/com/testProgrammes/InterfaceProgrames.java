package com.testProgrammes;

public class InterfaceProgrames {
	
	public static void main(String[] args) {
		
		final int i;
		i=20;
		System.out.println(i);
		
		
	int[] arr=new int[2];
	System.out.print(arr[0]);
	System.out.print(arr[1]);
	}

}

interface Interf 
{
 void run() ;
}

interface InterfA 
{
	void fast();
}
abstract class Car implements Interf
{
	public void display()
	{
		System.out.println("Car is running");
	}
}
