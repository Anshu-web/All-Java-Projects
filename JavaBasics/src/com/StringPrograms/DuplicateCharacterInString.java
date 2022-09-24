package com.StringPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {

		String str = "anshu kumar mishra";

		char[] ch = str.toCharArray();

		Map<Character, Integer> hm = new HashMap<>();

		for (char c : ch) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);
			}

			else {
				hm.put(c, 1);

			}
		}

		for (Entry<Character, Integer> entry : hm.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "  " + entry.getValue());
			}

		}

	}

}
