package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubarrayEqualToK {
	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the array ......");
		
		int sum=10;
		
		int arr[]= {4,7,5,9,1,3};
		
		Arrays.sort(arr);
		int count=0;
		
		System.out.println("After sorting the array .." +Arrays.toString(arr));
		
		int left=0;
		int right=arr.length-1;
		
		while (left<right) {
			
			if(arr[left]+arr[right]>sum) {
				right--;
			}
			else if(arr[left]+arr[right]<sum) {
				left++;
			}
			else
			{
				System.out.println(arr[left]+" ,"+arr[right]);
				count++;
				left++;
				right--;
				
			}
			
		}
		System.out.println("Number of subarrays are : " + count);
		
		
		
		 
	}
	
	

}
