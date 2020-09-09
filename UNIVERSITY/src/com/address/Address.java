package com.address;

public class Address {
	private int doorNo;
	private String streetName;
	private String district;
	private String state;
	private String country;
	private int pincode;
	
	public Address(int doorNo, String streetName, String district, String state, String country, int pincode) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
