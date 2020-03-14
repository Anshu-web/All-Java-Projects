package com.search;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[]= {12,23,34,45,56,67,78,89,90};
		
		int item=56;
		
		int li=0;
		int ui=arr.length;
		int mi=(li+ui)/2;
		
		while(li<=ui)
		{
			if(item==arr[mi])
			{
				System.out.println("Item found at "+mi);
				break;
			}
			else if(item<arr[mi])
			{
				ui=mi-1;
			}
			else
			{
				li=mi+1;
			}
			
			mi=(li+ui)/2;
		}
	}

}
