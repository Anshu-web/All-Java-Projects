package com.CustomizeImmutableClass;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientTest {

	
	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread().getName());
		
		Address address1=new Address();
		
		address1.setAddressline1("address Line1");
		address1.setAddressline2("address Line2");
		address1.setCity("Mumbai");
		
        Address address2=new Address();
		
		address2.setAddressline1("address Line3");
		address2.setAddressline2("address Line4");
		address2.setCity("Delhi");
		
		
		
		 
		
		List<String> skills=new ArrayList<>();
		skills.add("core java");
		skills.add("Data Structure");
		skills.add("MySql");
		
		Employee emp=new Employee(12, "Rahul", new BigDecimal("1000"), new Date(), address1,skills);
		Employee emp1=new Employee(13, "Rakhi", new BigDecimal("11000"), new Date(), address2,skills);
		
		System.out.println(emp);
		System.out.println(emp1);
		
		 
		
		System.out.println("===========================================================");
		
		emp1.getAddress().setCity("Pune");
		 
		emp1.getSkills().add("wewewewe");
		System.out.println(emp1);
		
		
		
	}
}
