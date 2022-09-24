package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Example {
	
	public static void main(String[] args) {
		
		List<Integer> arr= Arrays.asList(12,23,45,67,89);
		
	List<Integer>	list=arr.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(list);
		
	}

}
