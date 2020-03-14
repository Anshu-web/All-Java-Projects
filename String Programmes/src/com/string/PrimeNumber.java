package com.string;

 

public class PrimeNumber {
	
public static void main(String[] args) {
	
	StringBuffer sb=new StringBuffer();
	

	
	for(int i=1;i<=100;i++) {
		
		if(i%2==0)
		{
			sb.append(i+" ");
		}
		
	}
	
	System.out.print(sb);
 
	
	
}

}
