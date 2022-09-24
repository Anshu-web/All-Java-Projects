package com.inheritance;

import java.io.IOException;

public class OverridingExample {
	
	
	public static void main(String[] args) throws IOException {
		
		B a=new B();
		
		a.f1();
		a.f2();
		
	}

}


class A
{
	void f1() throws IOException
	{
		System.out.println("Print A");
	}
}

class B  extends A 
{
	void f1()
	{
		System.out.println("Print B");
	}
	
	void f2()
	{
		System.out.println("Print f2");
	}
}
