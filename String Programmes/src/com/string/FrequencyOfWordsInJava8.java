package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfWordsInJava8 {
	
	public static void main(String[] args) {
		
		
		String[] str= {"China", "Australia", "India", "USA", "USSR", "UK", "China", 
				  "France", "Poland", "Austria", "India", "USA", "Egypt", "China"};
		
		int [] arr= {12,23,45,567,887,4322,54,78};
		
		List<Integer> l=new ArrayList<>();
		
		l.add(12);
		l.add(23);
		l.add(45);
		l.add(567);
		l.add(887);
		l.add(4322);
		l.add(54);
		l.add(78);
		
		 List<Integer> list=l.stream().filter(I->I%2==0).collect(Collectors.toList());
		 
		 
		 
		 List<Integer> li= list.stream().sorted((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0).collect(Collectors.toList());
		 
		 System.out.println(li);
		
		
		// Map<String, Long> map=Stream.of(str).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		
		 
	 //System.out.println(map);
		 	 
		 
	}

}












