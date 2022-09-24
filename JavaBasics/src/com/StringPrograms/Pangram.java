package com.StringPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pangram {

	public static void main(String[] args) {
		
		
		// .skip(2).limit(2).
		// 12,32,54,76,90,98
		
	Arrays.asList(12,32,98,90,76,54).stream().sorted().skip(2).limit(2).forEach(System.out::println);
	
		

		int i = 0;
		// String input = "A QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		String input = "I AM VERY HAPPY ";

		int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		input = input.replace(" ", "");

		char[] charArray = input.toCharArray();

		System.out.println("charArray " + Arrays.toString(charArray));

		int size = charArray.length;

		while (i != size) {

			int index = charArray[i] - 65;

			arr[index] = 1;
			i++;

		}
		System.out.println("Value of charArray " + Arrays.toString(charArray));
		i = 0;
		while (i != 26) {
			if (arr[i] == 1) {
				i++;
			} else {
				System.out.println("Pttern is not Pangram >>>>>>>>>>>>>");

				System.exit(0);
			}
		}
		System.out.println("Pttern is  Pangram >>>>>>>>>>>>>>");
	}

}
