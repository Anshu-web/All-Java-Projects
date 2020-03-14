package com.string;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of A");

		int a = sc.nextInt();
		System.out.println("Enter the value of B");

		int b = sc.nextInt();
		System.out.println("Enter the value of C");

		int c = sc.nextInt();

		System.out.println("Enter the value of D");

		int d = sc.nextInt();

		if (a > b && a > c && a > d) {
			System.out.println(" a is largest");
		} else if (b > a && b > c && b > d) {
			System.out.println(" b is largest");
		} else if (c > a && c > b && c > d) {
			System.out.println("c is largest");
		} else if(d > a && d > b && d > c) {
			System.out.println(" d is largest");
		}
		else
		{
			System.out.println("All of them are equal");
		}
	}

}
