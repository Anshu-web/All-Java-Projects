package com.linklist;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {

		String str = "I am a good boy";

		String[] str1 = str.split(" ");

		// System.out.println(Arrays.toString(str1));

		int len = str1.length;

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str1[i] + " ";
		}

		System.out.println("revese is : " + rev);

	}

}
