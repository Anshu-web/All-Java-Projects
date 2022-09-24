package com.StringPrograms;

public class SumCharacterInName {
	
	public static void main(String[] args) {
		
		String MyName="AA";
		MyName=MyName.replace(" ", "");
		char arr[]=MyName.toCharArray();
		int size=arr.length;
		
		int i=0;
		int res=0;
		while (i!=size) {
			res=res+arr[i];
			i++;
		}
		
		System.out.println("Resultant of name character is :" + res);
				
		
	}

}
