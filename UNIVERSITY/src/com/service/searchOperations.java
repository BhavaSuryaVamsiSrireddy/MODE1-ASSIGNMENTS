package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.address.Address;
import com.college.College;
import com.department.Department;
import com.university.University;

public class searchOperations {

	ArrayList<University> universities = new ArrayList<University>();
	Scanner input = new Scanner(System.in);

	public int getUniversityId() {
		System.out.println("Enter university Id ");
		int universityId = input.nextInt();
		return universityId;
	}

	public String addingUniversity() {
		University university = new University();
		ArrayList<College> universityColleges = new ArrayList<College>();
		ArrayList<Department> universityDerpartments = new ArrayList<Department>();
		int universityId;
		String universityName;
		System.out.println("Enter the university id ");
		universityId = input.nextInt();
		System.out.println("Enter the university name ");
		universityName = input.next();
		System.out.println("Enter the address of university ");
		Address universityAddress = addingAddress();
		university.setUniversityId(universityId);
		university.setUniversityName(universityName);
		university.setUniversityColleges(universityColleges);
		university.setUniversityDerpartments(universityDerpartments);
		university.setUniversityAddress(universityAddress);
		universities.add(university);
		return "successfully added";
	}

	public String addingCollege(int universityId) {
		int collegeId;
		String collegeName;
		ArrayList<College> universityColleges = new ArrayList<College>();
		ArrayList<Department> collegeDepartments = new ArrayList<Department>();
		System.out.println("Enter college id ");
		collegeId = input.nextInt();
		System.out.println("Enter college name ");
		collegeName = input.next();
		System.out.println("Enter the address ");
		Address collegeAddress = addingAddress();
		College college = new College();
		college.setCollegeId(collegeId);
		college.setCollegeName(collegeName);
		college.setCollegeDepartments(collegeDepartments);
		college.setCollegeAddress(collegeAddress);
		for (University university : universities) {
			if (university.getUniversityId() == universityId) {
				university.getUniversityColleges().add(college);
			}
		}
		return "successfull added";
	}

	public String addingCollegeDepartment(int universityId, int collegeId) {
		int departmentId;
		String departmentName;
		ArrayList<Department> collegeDepartments = new ArrayList<Department>();
		System.out.println("Enter the department id ");
		departmentId = input.nextInt();
		System.out.println("Enter the department name ");
		departmentName = input.next();
		Department department = new Department();
		department.setDepartmentId(departmentId);
		department.setDepartmentName(departmentName);
		for (University university : universities) {
			if (university.getUniversityId() == universityId) {
				for (College college : university.getUniversityColleges()) {
					if (college.getCollegeId() == collegeId) {
						college.getCollegeDepartments().add(department);
					}
				}
			}
		}
		return "successfully added";
	}

	public String addingUniversityDepartment(int universityId) {
		int departmentId;
		String departmentName;
		ArrayList<Department> universityDerpartments = new ArrayList<Department>();
		System.out.println("Enter the department id ");
		departmentId = input.nextInt();
		System.out.println("Enter the department name ");
		departmentName = input.next();
		Department department = new Department();
		department.setDepartmentId(departmentId);
		department.setDepartmentName(departmentName);
		for (University university : universities) {
			if (university.getUniversityId() == universityId) {
				university.getUniversityDerpartments().add(department);
			}
		}
		return "successfully added";
	}

	public Address addingAddress() {
		int doorNo;
		String streetName;
		String district;
		String state;
		String country;
		int pincode;
		System.out.println("Enter the doorno ");
		doorNo = input.nextInt();
		System.out.println("Enter the street name ");
		streetName = input.next();
		System.out.println("Enter the district ");
		district = input.next();
		System.out.println("Enter the state ");
		state = input.next();
		System.out.println("Enter the country ");
		country = input.next();
		System.out.println("Enter the pincode ");
		pincode = input.nextInt();
		return new Address(doorNo, streetName, district, state, country, pincode);
	}

	public ArrayList<College> searchCollege(int universityId, String departmentName) {
		ArrayList<College> colleges = new ArrayList<College>();
		ArrayList<College> result = new ArrayList<College>();
		for (University university : universities) {
			if (university.getUniversityId() == universityId) {
				colleges = university.getUniversityColleges();
			}
		}
		for (College college : colleges) {
			ArrayList<Department> departments = college.getCollegeDepartments();
			for (Department department : departments) {
				if (department.getDepartmentName().equals(departmentName)) {
					result.add(college);
				}
			}
		}
		return result;
	}

	public ArrayList<College> searchCollegeByDistrict(int universityId, String district) {
		ArrayList<College> colleges = new ArrayList<College>();
		ArrayList<College> result = new ArrayList<College>();
		for (University university : universities) {
			if (university.getUniversityId() == universityId) {
				colleges = university.getUniversityColleges();
			}
		}
		for (College college : colleges) {
			if (college.getCollegeAddress().getDistrict().equals(district)) {
				result.add(college);
			}
		}
		return result;
	}
}
