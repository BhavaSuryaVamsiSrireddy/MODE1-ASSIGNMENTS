package com.college;

import java.util.ArrayList;

import com.address.Address;
import com.department.Department;

public class College {
	private int collegeId;
	private String collegeName;
	private ArrayList<Department> collegeDepartments;
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public ArrayList<Department> getCollegeDepartments() {
		return collegeDepartments;
	}
	public void setCollegeDepartments(ArrayList<Department> collegeDepartments) {
		this.collegeDepartments = collegeDepartments;
	}
	public Address getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(Address collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	private Address collegeAddress;
	
}
