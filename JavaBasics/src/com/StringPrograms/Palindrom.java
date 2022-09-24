package com.StringPrograms;

import java.util.Arrays;

public class Palindrom {

	public static void main(String[] args) {

		String s = "REFER";

		String rev = "";
		char[] ch = s.toCharArray();
		int size = ch.length;

		char c[] = new char[size];

		int i = 0;

		while (i != size) {

			c[i] = ch[size - 1-i];
			i++;
		}

		rev=c.toString();
		
		if(rev.equals(c.toString())) {
			System.out.println("palindrom");

		}
		else
		{
			System.out.println("not palindrom");

		}
		System.out.println(Arrays.toString(c));

	}

}
