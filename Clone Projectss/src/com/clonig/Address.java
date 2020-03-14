
package com.clonig;

public class Address {
	
	private int id;
	private String addressline1;
	private String addressline2;
	private String city;
	private int zipcode;
	
	public Address(int id, String addressline1, String addressline2, String city, int zipcode) {
		super();
		this.id = id;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressline1=" + addressline1 + ", addressline2=" + addressline2 + ", city="
				+ city + ", zipcode=" + zipcode + "]";
	}
	
	

}
