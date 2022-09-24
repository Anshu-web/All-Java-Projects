package com.StringPrograms;

public class PrintVowels {

	public static void main(String[] args) {

		String str = "ertyufghjcvbn";

		char[] charArray = str.toCharArray();

		int len = charArray.length;

		for (int i = 0; i < len; i++) {

			if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o'
					|| charArray[i] == 'u') {
				
				
				System.out.println(charArray[i]);

			}
			

		}

	}

}
