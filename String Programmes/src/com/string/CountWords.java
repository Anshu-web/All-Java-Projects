package com.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class CountWords {
	
	public static void main(String[] args) {
		
		/*
		 * //String[] arr= {"Anshu","Rahul","Rohit","Rekha"};
		 * 
		 * String arr= "My Name Is Lakhan";
		 * 
		 * String rev="";
		 * 
		 * String[] s=arr.split(" ");
		 * 
		 * for(String st:s) { //System.out.println(st);
		 * 
		 * for(int i=st.length()-1;i>=0;i--) {
		 * 
		 * rev=rev+st.charAt(i)+" ";
		 * 
		 * 
		 * } System.out.println(rev);
		 * 
		 * }
		 */
		
		List<Integer> l=new ArrayList<>();
		
		l.add(12);
		l.add(13);
		l.add(23);
		l.add(71);
		
		l.stream().forEach(i->System.out.println(i));
		List<Integer> list=l.stream().sorted((I1,I2)->(I1<I2)?1:(I1>I2)?-1:0).collect(Collectors.toList());
		
		System.out.println(list);
		
		Optional<Integer> reduced=l.stream().reduce((a,b)->a+b);
		
		System.out.println(reduced.get());
	}

}










