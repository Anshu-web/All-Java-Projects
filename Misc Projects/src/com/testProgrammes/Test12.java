package com.testProgrammes;

import java.util.Scanner;

public class Test12 {
	
 int x;
 String name;
 

	public Test12(int x, String name) {
	 
	this.x = x;
	this.name = name;
	
	
	System.out.println(x + name);
}

	public static void main(String[] args) {
		
		Test12 t=new Test12(12, "name");
		
		Test12 t1=new Test12(12, "name");
		
		t1=t;
		
		System.out.println(t + "   first");
		
		System.out.println(t1 + "   second");
		
	 
	
		// System.out.println("Hello");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of x");

		int x = sc.nextInt();

		System.out.println("Enter the value of y");

		int y = sc.nextInt();

		System.out.println("Enter the value of z");

		int z = sc.nextInt();

		if (x > y) {
			// System.out.println(x +"is greatest");

			if (x > z) {
				System.out.println(x + " is greatest");
			} else {
				System.out.println(z + " z is greatest");
			}
		} else if (y > z) {
			System.out.println(y + " is greatest");
		} else {
			System.out.println(z + " is greatest");
		}

	}


}
