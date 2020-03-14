package com.CustomizeImmutableClass;

 import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test1 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ImmutableClass1 c1=new ImmutableClass1(11, "Hanshika", new BigDecimal(1000),new Date("12/2/1990"));
		ImmutableClass1 c2=new ImmutableClass1(13, "Rinki", new BigDecimal(2000),new Date("12/2/1980"));
		ImmutableClass1 c3=new ImmutableClass1(14, "Radhika", new BigDecimal(3000),new Date("12/2/1970"));
		ImmutableClass1 c4=new ImmutableClass1(12, "Hanshika", new BigDecimal(1000),new Date("12/2/1960"));
		
		HashMap<ImmutableClass1, String> map=new HashMap<>();
		
		map.put(c1, "IT1");
		map.put(c2, "IT2");
		map.put(c3, "IT3");
		map.put(c4, "IT1");
		
		System.out.println(map.size());
		
		for(Entry entry:map.entrySet())
		{
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("=====================================================");
		 c1.getDob().setTime(456789678);
		 c1.getDob().setYear(2000);
		
		System.out.println(c1);
		 
		 
	}

}
