package com.test;

public class Test {
	
	public static void main(String[] args) {
		
		
		int x = 1;
				int y = 1;
				int z=0;
				while (x < 25) {
				  z = x;
				  x = x + y;
				  y = z;
				}
				
				System.out.println(x);
	}

}
