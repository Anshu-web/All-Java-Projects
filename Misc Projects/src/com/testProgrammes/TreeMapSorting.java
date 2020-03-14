package com.testProgrammes;

 
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapSorting {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> map=new TreeMap<>(new MyComparator());
		
		map.put(1, "orange");
		map.put(5, "apple");
		map.put(4, "mango");
		map.put(3, "grapes");
		map.put(2, "banana");
		
	System.out.println(map);
	
 
		// (I1,I2)->(I1<I2)?-1:(I1>I2)?1:0
	

		
		
	}

}



class MyComparator implements Comparator<Object>
{
	

	 
	public int compare(Object o1, Object o2) {
		 
		
			int num1=(int) o1;
			int num2=(int) o2;
			
			if(num1<num2)
			{
				return 1;
			}
			else if(num1>num2)
			{
				return -1;
			}
			return 0;
			
		
	}
 
}
