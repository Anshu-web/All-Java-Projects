package com.CustomizeImmutableClass;

public class Address {
	
	private String addressline1;
	private String addressline2;
	private String city;
 
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
	@Override
	public String toString() {
		return "Address [addressline1=" + addressline1 + ", addressline2=" + addressline2 + ", city=" + city + "]";
	}
	
	

}
