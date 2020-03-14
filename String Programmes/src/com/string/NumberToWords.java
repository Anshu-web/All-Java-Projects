package com.string;

import java.util.Scanner;

public class NumberToWords {

	static String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	static String tens[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "Eighty", "ninety" };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");

		int num = sc.nextInt();

		String output = convert(num);

		System.out.println(output);

	}

	public static String fun(int n) {
		String str = "";

		if (n < 20) {
			return ones[n];
		} else if (n >= 20 & n < 100) {
			return tens[n / 10] + " " + ones[n % 10];

		} else {
			return "Number not in the range";
		}
	}

	public static String convert(int n) {

		if (n < 100) {
			return fun(n);
		}

		else if (n >= 100 && n < 1000) {
			return fun(n / 100) + " Hendred " + convert(n % 100);
		} else if (n >= 1000 && n < 100000) {

			return fun(n / 1000) + " Thousand " + convert(n % 1000);

		} else if (n >= 100000 && n < 10000000) {

			return fun(n / 100000) + " Lac " + convert(n % 100000);

		} else if (n >= 10000000 && n < 1000000000) {

			return fun(n / 10000000 ) + " Crore " + convert(n % 10000000 );

		} else {
			return "Number Not Found";
		}

	}
}
