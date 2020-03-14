package com.pattern;

public class IOS implements OS {
	
	private int id;
	private String name;
	
	
	
	public IOS(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


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
		System.out.println("Quite trending in the market");

	}
	
	@Override
	public String toString() {
		return "AndroidOS [id=" + id + ", name=" + name + "]";
	}

}
