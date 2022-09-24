package com.immutable;

import java.util.TreeSet;

public final class Student {
	
	 private final String name;
	 private final int id;
	 
	 
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	 
	 
}

class Test
{
	public static void main(String[] args) {
		TreeSet<Student> tr=new TreeSet<>();
		tr.add(new Student("Anshu", 32));
	}
	
	
	
}
