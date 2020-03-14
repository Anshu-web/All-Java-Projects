package com.string;

import java.util.Scanner;

public class Test {
	
	static String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	static String tens[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "Eighty", "ninety" };
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num=sc.nextInt();
		
		String number=convert(num);
		
		System.out.println(number);
		
	}
	
	public static String fun(int num)
	{
		
		if(num<20)
		{
			return ones[num];
		}
		
		
		else if(num>=20 && num<100)
		{
			return tens[num/10]+" "+ ones[num%10];
		}
		return "Not in range";
	}
	
	public static String convert(int num)
	{
		if(num<100)
		{
			return fun(num);
		}
		if(num>=100 && num<1000)
		{
			return fun(num/100)+" Hundred "+convert(num%100);
		}
		
		return "Beyond the range";
	}

}
