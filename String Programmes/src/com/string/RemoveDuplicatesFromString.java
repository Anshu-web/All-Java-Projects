package com.string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String str = "Actually";

		Set<Character> set = new HashSet<>();

		StringBuffer sf = new StringBuffer();

		System.out.println("Original String as :" + str);

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);

			if (!set.contains(c)) {
				set.add(c);
				sf.append(c);
			}

		}
		System.out.println("After removing the dublicates from the string :" + sf);

	}

}
