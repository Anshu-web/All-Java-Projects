package com.json;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();

			Employee emp = new Employee(12, "Anshu", "IT");
			
			// Convert Java Object to JsonString
			String writeValueAsString = mapper.writeValueAsString(emp);
			System.out.println(writeValueAsString);

			// Iterating over JsonObject
			//JSONObject jsonObject = new JSONObject(writeValueAsString);
			//int int1 = jsonObject.getInt("id");
			//String name=jsonObject.getString("name");
			//System.out.println(int1 +" "+name);
			
			// Converting JsonObject to Java object
			
			
			Employee readValue = mapper.readValue(writeValueAsString.toString(),
					Employee.class);
			System.out.println(readValue);
			 if (readValue!=null) {
				System.out.println(readValue.dep);
			}else {
				System.out.println("null value");
			}
			
			System.out.println(readValue);

		} catch (Exception e) {
			 
		}

	}

}
