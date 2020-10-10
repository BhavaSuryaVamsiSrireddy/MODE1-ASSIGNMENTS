package com.pojo;

public class Address {
	
	private int doorNo;
	private String city;
	private String country;
	
	public Address() {
		super();
	}
	public Address(int doorNo, String city, String country) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.country = country;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
