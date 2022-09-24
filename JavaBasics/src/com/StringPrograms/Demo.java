package com.StringPrograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class A {
	void m1() throws IOException, Exception {
		System.out.println("In m1 A");
	}

	void m3() {
		System.out.println("In m2 C");
	}
}

class B extends A {
	void m1() throws Exception {
		System.out.println("In m1 B");
	}

	void m2() {
		System.out.println("In m2 B");
	}
}

public class Demo {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Anshu", 12);
		hm.put("Eshaan", 121);

		Iterator<Entry<String, Integer>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {

			Entry<String, Integer> entry = itr.next();

			String s = entry.getKey();

			System.out.println(s);
		}

		A a = new B();
		try {
			a.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.m3();
	}
}
