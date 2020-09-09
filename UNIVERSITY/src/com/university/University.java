package com.university;

import java.util.ArrayList;

import com.address.Address;
import com.college.College;
import com.department.Department;

public class University {
	
	private int universityId;
	private String universityName;
	private Address universityAddress;
	private ArrayList<Department> universityDerpartments;
	private ArrayList<College> universityColleges;
	public int getUniversityId() {
		return universityId;
	}
	public void setUniversityId(int universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public Address getUniversityAddress() {
		return universityAddress;
	}
	public void setUniversityAddress(Address universityAddress) {
		this.universityAddress = universityAddress;
	}
	public ArrayList<Department> getUniversityDerpartments() {
		return universityDerpartments;
	}
	public void setUniversityDerpartments(ArrayList<Department> universityDerpartments) {
		this.universityDerpartments = universityDerpartments;
	}
	public ArrayList<College> getUniversityColleges() {
		return universityColleges;
	}
	public void setUniversityColleges(ArrayList<College> universityColleges) {
		this.universityColleges = universityColleges;
	}
}
