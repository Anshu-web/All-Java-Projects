package com.httpClient;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class APICallingDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		// var URI = "https://covidtracking.com/data/api";
		// var URI="https://api.covidtracking.com";
		var URI = "https://jsonplaceholder.typicode.com/albums";

		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(java.net.URI.create(URI)).build();

		HttpResponse<String> send = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

		System.out.println(send.statusCode());
		String body = send.body();
		//System.out.println(body);
		
		String arr= send.body();
		
		JSONArray jarry=new JSONArray(send.body());
		
		 for (int i = 0; i < jarry.length(); i++) {
			JSONObject obj= jarry.getJSONObject(i);
			int userId=obj.getInt("userId");
			int id=obj.getInt("id");
			String title=obj.getString("title");
			
			System.out.println(id + " : "+userId + " : "+title);
			
		}
		
		HttpHeaders headers = send.headers();
		// System.out.println(headers);
		 headers.map().forEach((key, values) -> {
	            System.out.printf("%s: %s%n", key, values);
	        });

	}

}
