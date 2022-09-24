package com.linklist;

import java.util.Comparator;

public class Sorting {
	
	public static void main(String[] args) {
		
		
		
	}

}


class Mycomparator implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		 
	
	int id1=o1.getId();
	int id2=o2.getId();
	
	if(id1>id2) {
		return 1;
	}
	else if(id1<id2) {
		return -1;
	}
	
		return 0;
}}

	



 
