package com.java;

import java.util.Arrays;

public class StringExamplee {

	public static void main(String[] args) {

		System.out.println("Welcome back to STS >>>>>>>>>>>>>>>>>>>>");

		int arr[] = { 12, 34, 56, 78, 89, 90 };

		int length = arr.length;

		reverseArray(arr, length);

	}

	private static void reverseArray(int[] arr, int length) {

		int left = 0;
		int right = (arr.length - 1);
		int temp = 0;

		while (left < right) {
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}

		for (int i = 0; i < arr.length; i++)

		{
			System.out.print(arr[i] + " ");
		}

	

	//////////////////////////////////////////////////////////

	String[] arr1 = { "Hello", "World" };
	StringBuilder reversed = new StringBuilder();

	for(int i = arr.length;i>0;i--)
	{
		reversed.append(arr[i - 1]).append(" ");
	}

	String[] reversedArray = reversed.toString().split(" ");

	System.out.println(Arrays.toString(reversedArray));

}}
