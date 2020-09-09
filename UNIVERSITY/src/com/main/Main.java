package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.college.College;
import com.service.searchOperations;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int choice;
		searchOperations searchOperations = new searchOperations();
		while (flag) {
			System.out.println(
					"1.to add university\n2.to add college\n3.to add department in a college\n4.to add department in university\n5.to search colleges by department\n6.to search college by district\n7.to exit");
			System.out.println("Enter choice ");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println(searchOperations.addingUniversity());
				break;
			case 2:
				System.out.println(searchOperations.addingCollege(searchOperations.getUniversityId()));
				break;
			case 3:
				System.out.println("Enter the college id");
				int collegeId = input.nextInt();
				System.out.println(
						searchOperations.addingCollegeDepartment(searchOperations.getUniversityId(), collegeId));
				break;
			case 4:
				System.out.println(searchOperations.addingUniversityDepartment(searchOperations.getUniversityId()));
				break;
			case 5:
				System.out.println("enter department name");
				String departmentName = input.next();
				ArrayList<College> colleges = searchOperations.searchCollege(searchOperations.getUniversityId(),
						departmentName);
				if(colleges.size()==0) {
					System.out.println("no results found");
					break;
				}
				for (College college : colleges) {
					System.out.println(
							"college id " + college.getCollegeId() + " college name " + college.getCollegeName());
				}
				break;
			case 6:
				String district;
				System.out.println("enter district to get colleges in that district ");
				district = input.next();
				ArrayList<College> districtColleges = searchOperations
						.searchCollegeByDistrict(searchOperations.getUniversityId(), district);
				if(districtColleges.size() == 0) {
					System.out.println("no results found");
				}
				for (College college : districtColleges) {
					System.out.println(
							"college id " + college.getCollegeId() + " college name " + college.getCollegeName());
				}
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("please enter a valid choice !!!");
			}
		}
	}

}
