package com.exceptions;

import java.util.Scanner;

public class CheckedException {
	
	
	
public static void main(String[] args) {
		
		Test test=new Test();
		
		test.atm(10000);
		
	}

}

class Lowbalance extends Exception
{
	Lowbalance()
	{
		super("Insuff Balance"); 
	}
}

class Test
{
	static void atm(int m)
	{
		int money=10000;
		int withdraw=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the withdraw amount");
		
		withdraw=sc.nextInt();
		
		if(money<withdraw)
		{
			try
			{
			throw new Lowbalance();
			}
			catch(Lowbalance e)
			{
				//System.out.println("Insufficient balance kindly fund your account");
				System.out.println(e);
			}
		}
		else
		{
			withdraw=money-withdraw;
			
			System.out.println("Remaining Balance: "+withdraw);
		}
		 
	}
}