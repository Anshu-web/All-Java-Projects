package com.string;

public class Demo {
	
	public boolean comparestring(String first,String second)
	{
		if(first.equals(second))
		{
			return true;
		}
		else
		{
			return false;
		}
				
	}
	
	public String concatstring(String first,String second)
	{
		 return first.concat(second);
				
	}
	
	public int [] addOneToarray(int [] numbers)
	{
		int length=numbers.length;
		int[] output=new int[length];
		for(int i=0;i<length;i++)
		{
			output[i]=numbers[i]+1;
		}
		
		return output;
	}

}
