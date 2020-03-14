package com.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	/*
	 * //@Test void testcomparestring() {
	 * 
	 * Demo demo=new Demo();
	 * 
	 * assertTrue(demo.comparestring("Hello", "Hel00lo"), "Hello and Helo fails"); }
	 */
	
	
	
	/*
	 * @Test public void testconcatstring() { Demo d=new Demo();
	 * assertEquals("HelloWorld", d.concatstring("Hello", "World")); }
	 */
	
	
     @Test
     public void testaddonetoArray()
     {
    	 Demo demo1=new Demo();
    	 
    	 int[] expected=new int[]{3,8};
    	 assertArrayEquals(expected, demo1.addOneToarray(new int[] {2,7}));
     }
}
