package com.pattern;

public class WindowsOS implements OS {
	
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

	@Override
	public void pecs() {
		System.out.println("Outdated Device");

	}
	
	@Override
	public String toString() {
		return "AndroidOS [id=" + id + ", name=" + name + "]";
	}

}
