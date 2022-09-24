package com.linklist;

public class Test {

	public static void main(String[] args) {

		// 6. Write a method to return the second largest element in an integer array
		// passed as an input parameter.

		int[] arr = new int[] { 12, 34, 56, 78, 89 };
		largest(arr);

		// All permutation and combination of a string
		String str = "abc";

		char[] ch = str.toCharArray();

		int len = ch.length;

		int j = 0;
		char firstChar = ch[j];

		String res = "";

		while (j != len) {

			for (int i = 1; i < len; i++) {

				res = res + ch[i];

			}
			res = res + firstChar;
			j++;
			System.out.println(res);

		}
	}

	private static void largest(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];

		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];

			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}
		}

		System.out.println("Second largest number is:" + secondLargest);

	}

	// reverse order of data of link list

	public void reverseData(Node head) {

		if (head.next == null) {
			System.out.println("No data present");
		}

		Node n = head;

		if (n.next != null) {
			n = n.next;

			System.out.println(n.data);
		}

	}
}
