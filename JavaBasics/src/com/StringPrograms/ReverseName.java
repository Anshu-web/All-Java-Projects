package com.StringPrograms;

public class ReverseName {

	public static void main(String[] args) {

		String name = "1234";
		name=name.toUpperCase();
		char ch[] = name.toCharArray();
		int length = ch.length;

		StringBuilder sb = new StringBuilder();

		for (int i = length - 1; i >= 0; i--) {
			sb.append(ch[i]);

		}

		System.out.println(sb);

	}
}
