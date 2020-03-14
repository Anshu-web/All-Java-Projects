package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		
	int arr[]= {12,23,45,67,43,32,21,89,65,54};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int MV=arr[i];
			int MI=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					MV=arr[j];
					MI=j;	
				}
				
			}
			temp=arr[i];
			arr[i]=arr[MI];
			arr[MI]=temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
	
	}

}
