package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtAnyPostion {

	public static void main(String[] args) {

		int[] arr = new int[6];
		  
		int pos = 0;
		int value = 0;
		int max = 5;

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Enter the no. of elements in the array :");
		 * 
		 * n=sc.nextInt();
		 */

		System.out.println("\nEnter the elements to array :");

		for (int i = 0; i < max; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array is as follows :");

		for (int i = 0; i <= max; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Enter the position where you want to insert the value :");

		pos = sc.nextInt();

		System.out.println("Enter the value you want to enter :");

		value = sc.nextInt();

		for (int i = max; i > pos; i--) {
			arr[i] = arr[i - 1];
		}
		arr[pos] = value;

		System.out.println("After entering the array is :");

		for (int j = 0; j <= max; j++) {
			//System.out.println(arr[j]);
		}

		System.out.println(Arrays.toString(arr));
	}

}
