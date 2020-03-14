

package com.testProgrammes;

public class Test13 {
	
	
	static int x=43;

}

class B extends Test13
{
	int c=12;
}

class Demo
{
	
	public static void main(String[] args) {
		
		B b=new B();
		
		System.out.println(b.x);
		
	}
}
