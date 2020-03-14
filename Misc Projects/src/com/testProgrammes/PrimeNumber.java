package com.testProgrammes;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int n=1;
		int flag=0;
		
		for(int i=2;i<=(n-1);i++)
		{
			
			if(n==0||n==1)
			{
				System.out.println("number is not prime");
			}
			if(n%i==0)
			{
				System.out.println("Number "+ n +" is not prime");
				flag=1;
				break;
				
			}
		}
			if(flag==0)
			{
				System.out.println("Number "+ n +" is prime");
				
			}
		}
	}


