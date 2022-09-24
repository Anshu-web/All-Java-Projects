package com.StringPrograms;

import java.util.Arrays;

public class CountNumberOfWords {
	
	public static void main(String[] args) {
		
		
		String sentence="My Name Is Khan";
		
		String []sArray=sentence.split("\\ ");
		
		System.out.println(Arrays.toString(sArray));
		
		int len=sArray.length;
		
		System.out.println("No. of words are  :" + len);
		
	 
		
		
		
	}

}
