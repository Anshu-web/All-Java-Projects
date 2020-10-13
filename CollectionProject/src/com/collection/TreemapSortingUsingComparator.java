package com.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreemapSortingUsingComparator {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap=new TreeMap<>(new MyComp());
		treeMap.put("Anshu", 12);
		treeMap.put("Rahul", 121);
		treeMap.put("Hanshika", 132);
		treeMap.put("Deva", 124);
		treeMap.put("Rinki", 142);
		
		System.out.println(treeMap);
		
		
		
	}

}

class MyComp implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		 
		String n1=o1;
		String n2=o2;
	return	-n1.compareTo(n2);
		 
	}
	
}