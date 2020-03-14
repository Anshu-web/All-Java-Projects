package com.pattern;

public class AndroidOS implements OS {

	
	private int id;
	private String name;
	
	
	
	public AndroidOS(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	
	@Override
	public void pecs() {
		 
		System.out.println("Powerful Device");

	}


	@Override
	public String toString() {
		return "AndroidOS [id=" + id + ", name=" + name + "]";
	}
	
	

}
