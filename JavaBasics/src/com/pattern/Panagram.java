package com.pattern;

import java.util.Arrays;
import java.util.Stack;

public class Panagram {

	public static void main(String[] args) {

		// String str = "Institution is made for inculcating positive thinking Positive
		// thinking is beginning of happiness Happiness gives strength Stand and die in
		// your own strength if any sin in the world it is weakness Avoid all weakness
		// Weakness in sin weakness is death Education is a passport or gateway of the
		// future";

		String str = "a quick brown fox jumps over the laz dog";
		str = str.toUpperCase();

		str = str.replaceAll(" ", "");
		System.out.println(str);

		int length = str.length();

		System.out.println("length  of string is " + length);

		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		char[] ch = str.toCharArray();
		int i = 0;
		while (i != ch.length) {

			int index = ch[i] - 65;

			arr[index] = 1;

			i++;
		}

		System.out.println(Arrays.toString(arr));

		int j = 0;
		while (j < arr.length) {

			if (arr[j] == 1) {
				j++;
				
			}

			else {
				System.out.println("Not Panagram :");
System.exit(0);			}

		}
		System.out.println("  Panagram :");
		  

	}

}
