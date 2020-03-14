package com.testProgrammes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Human {

	public static void main(String[] args) throws IOException {

		// Input from scanner class=======================

		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * System.out.println("Enter the age");
		 * 
		 * int s=sc.nextInt(); System.out.println("Enter the roll");
		 * 
		 * int s1=sc.nextInt();
		 * 
		 * System.out.println("Enter the city");
		 * 
		 * String s2=sc.nextLine(); System.out.println("Enter the country");
		 * 
		 * String s3=sc.nextLine();
		 * 
		 * System.out.println(s+ " "+ s1+ " "+s2 + s3);
		 */

		// Input from BufferedReader class===================================

		// BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*
		 * System.out.println("Enter the name");
		 * 
		 * String str=br.readLine(); System.out.println("Enter the age");
		 * 
		 * String str1=br.readLine(); System.out.println("Enter the roll");
		 * 
		 * String str2=br.readLine();
		 * 
		 * System.out.println(str+ " "+ str1+ " "+str2);
		 */

		// Input from System.console()

		// String name = System.console().readLine();

		// System.out.println(name);

		String str = "EQUATION";

		HashMap<Character, Integer> hm = new HashMap<>();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

				sb.append(ch);
			}

		}

		System.out.println(sb);
	}
}
