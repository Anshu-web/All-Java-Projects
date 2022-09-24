package com.json;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonObjectManipulation {
	
	 public static void main(String[] args) {
	 
		 
		 
		
		 JSONObject obj=new JSONObject();
		 obj.put("name", "Anshu");
		 obj.put("age", 30);
		 
		 JSONObject jo=new JSONObject();
		 jo.put("details", obj);
		 
		 
		 
		 Map<String, String> m=new HashMap<>();
		 m.put("address", "Noida");
		 m.put("phoneNumber", "45678");
		 
		 JSONArray ja=new JSONArray();
		 ja.add(ja);
		 System.out.println(ja);
	}
	 
	

}
