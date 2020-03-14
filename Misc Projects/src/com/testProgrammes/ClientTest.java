package com.testProgrammes;

 import java.util.List;

public class ClientTest {
	
	public static void main(String[] args) {
		
		
		Subject subject=new Subject("English","Hindi","Maths","History");
		/*
		 * subject.setSub1("English"); subject.setSub2("Hindi");
		 * subject.setSub3("Maths"); subject.setSub4("History");
		 */
		
		//Student student=new Student("Rahul",subject);
		//student.setName("Anshu");
		//student.getSubjects();
 
 		StringBuilder s= new StringBuilder("Anshu");
 		
 		s.reverse();
 
		System.out.println(s);
		
	}

}
