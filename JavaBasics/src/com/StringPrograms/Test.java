package com.StringPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException  {

		 
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		System.out.println("Enter the string to be reversed :");

		String input = br.readLine();

		char ch[] = input.toCharArray();

		String rev = "";

		int len = ch.length;

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}

		System.out.println("reversed String is :" + rev);
	}
	
 

}
