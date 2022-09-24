package com.java8;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SecondHighestAndLowestElement {
	
	
	public static void main(String[] args) {
		
		List<Integer> list=List.of(12,34,56,87,90,54,21);
		
		int sl=list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(sl);
		
		int sh=list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(sh);
		
	}

}
