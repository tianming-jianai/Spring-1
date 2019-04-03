package com.atguigu.spring.beans.spel;

public class Address {
	private String city;
	private String street;
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		System.out.println("getCity");
		return city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	
	
}
