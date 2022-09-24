package com.collection;

import java.util.Arrays;

public class MapExamples {

	public static void main(String args[]) {
		int[] arr = { 10, 15, 3, 7,4,7,9,0,2,1,5,3,7,3 };
		Arrays.sort(arr);
		int k = 17;

		 
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			
			if(arr[left]+arr[right]>k) {
				right--;
				
			}
			else if (arr[left]+arr[right]<k) {
				left++;
				
			}
			else {
				System.out.println("pair is :" + arr[left] + "," + arr[right]);
				left++;
				right--;
				
			}
		}
	}
}
