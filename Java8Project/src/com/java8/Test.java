package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		int[] arr = { 12, 23, 45, 56, 678, 78 };

		List<Integer> list = new ArrayList<>();
		
		System.out.println(Test.class);

		list.add(12);
		list.add(132);
		list.add(412);
		list.add(912);
		list.add(121);

		/*
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * if (arr[i] % 2 == 0) { System.out.println(arr[i]); }
		 */

		/*
		 * int li=Arrays.stream(arr).sum();
		 * 
		 * 
		 * List<Integer> listl
		 * =list.stream().filter(i->i%2==0).collect(Collectors.toList());
		 * System.out.println(listl);
		 */
		String str = "AAAA";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("Entered String is palindrome");
		} else {
			System.out.println("Entered String is not a palindrome");
		}
		
		Object obj=new Object();
		
		System.out.println(obj.getClass());

	}
}


