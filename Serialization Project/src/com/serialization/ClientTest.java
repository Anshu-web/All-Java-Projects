package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientTest {
	
	public static void main(String[] args) {
			
		String fileName="employee.ser";
		//serializeObject(fileName);
		
		deserializeObject(fileName);

		
	}

	private static void deserializeObject(String fileName) {
		 
		try(ObjectInputStream ooi=new ObjectInputStream(new FileInputStream(new File("fileName")))) {
			
			Object obj=ooi.readObject();
			Employee emp=(Employee) obj;
			System.out.println(emp);
				
			} catch (Exception e) {
				e.printStackTrace();
				 
			}
	}

	private static void serializeObject(String fileName) {
		 
		Address address=new Address(12, "B10A", "77/C", "Noida", 201L);
		
		Employee employee=new Employee(13, "Anshu", 28," a@gmail.com", "Java");
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("fileName")))) {
			
		oos.writeObject(employee);
		
		System.out.println("Object is being serialized...");
			
		} catch (Exception e) {
			e.printStackTrace();
			 
		}
		
	}

}
