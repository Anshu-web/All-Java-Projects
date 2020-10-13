package com.java8;

import java.util.Optional;

public class OptionalClass {
	
	public static void main(String[] args) {
		
		
		Optional<String> opt=Optional.empty();
		
		//System.out.println(opt);
		
		String book=null;
		
		if(book!=null)
		{
			System.out.println(book.toUpperCase());
		}
		
		
		opt=Optional.ofNullable(book);
		
		if(opt.isPresent())
		{
			System.out.println(opt.get().toUpperCase());
		}
		
		
	}

}