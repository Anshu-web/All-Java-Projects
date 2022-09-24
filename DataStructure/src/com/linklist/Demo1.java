package com.linklist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.stream.Collectors;

public class Demo1 {

	// multithreading

	// disable jre and then check

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		int[] a = { 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1 };

		int lent = a.length;
		int tinu = 0;
		int minu = lent - 1;
		int rev = 0;

		while (tinu < minu) {

			if (a[tinu] < a[minu]) {

				tinu++;
				minu--;

			}

			else if (a[tinu] > a[minu]) {

				rev = a[tinu];
				a[tinu] = a[minu];
				a[minu] = rev;
				
				tinu++;
			}

			else if (a[tinu] == a[minu]) {
				minu--;
			}
		}

		System.out.println("Done by Tinu Jha  :" + Arrays.toString(a));

		Emp e1 = new Emp(12, "Hello");
		Emp e2 = new Emp(12, "Helloa");

		HashMap<Emp, String> hashMap = new HashMap<>();

		hashMap.put(e1, e1.getName());
		hashMap.put(e2, e2.getName());

		System.out.println("Size of map is : " + hashMap.size());

		System.out.println(" map is: " + hashMap);

		HashMap<String, String> hm = new HashMap<>();

		hm.put("Name", "Anshu");
		hm.put("Name1", "Rahul");
		hm.put("Name2", "Ankit");

		for (Entry<String, String> set : hm.entrySet()) {

			String entry = set.getValue();

			if (entry.startsWith("A")) {

				System.out.println(entry);
			}

		}

		int[] arr = { 1, 2, 3, 4, 5, 1 };

		int len = arr.length;

		int tSum = 0;
		int sum = 0;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 1; j++) {

				sum = arr[j] + arr[j + 1];

				int res = tSum / 2;

				if (sum == res) {

					System.out.println("The required index is " + i);

				}

				System.out.println("The required index not found");

			}
		}

		/*
		 * int a = 5; int b = 6; a = a + b; b = a - b; a = a - b;
		 */

		// System.out.println(a + " " + b);

		ArrayList<Integer> li = new ArrayList<>();

		li.add(12);
		li.add(62);
		li.add(90);
		li.add(45);
		li.add(2);
		li.add(76);

		li.stream().filter(li::contains).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("====================");

		List<Integer> l = li.stream().sorted().skip(4).collect(Collectors.toList());

		List<Integer> ll = li.stream().sorted(Collections.reverseOrder()).limit(2).collect(Collectors.toList());

		// List<Integer> ll=li.stream().sorted(Comparator<Integer>.compare)

		System.out.println("Top two " + ll);

		int x = 5;
		// x=x+x++;
		System.out.println("X = " + x);

		x = x++ + x++;

		System.out.println("X = " + x);

		System.out.println(100 + 100 + "Hello");
		System.out.println("Hello" + 100 + 100);

		checkBoolean1(null);
		checkBoolean1(false);

		Integer in;

		List<Integer> list = new ArrayList<>();

		list.add(12);
		list.add(13);
		list.add(54);
		list.add(67);

		list.stream().forEach(System.out::println);

	}

	private static void checkBoolean1(Boolean b1) {

		if (Boolean.TRUE.equals(b1)) {

			System.out.println(b1);
		}
		System.out.println("false");

	}

	private static void checkBoolean1(boolean b2) {

		if (b2) {
			System.out.println(b2);
		}
		System.out.println("false again");

	}

}

class Emp {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}
