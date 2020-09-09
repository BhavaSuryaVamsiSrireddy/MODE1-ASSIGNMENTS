package com.main;

import java.util.Scanner;

import com.pojo.Student;
import com.service.StudentOperations;

public class Main {

	public static void main(String[] args) {
		StudentOperations studentOperations = new StudentOperations();
		Scanner input = new Scanner(System.in);
		int choice;
		boolean flag = true;
		while (flag) {
			System.out.println(
					"1.TO ADD STUDENT\n2.TO GET FULLNAME\n3.TO GET AGE\n4.TO GET GENDER\n5.TO GET TOTAL MARKS\n6.TO GET AVERAGE\n7.TO GET STUDENT DETAILS\n8.TO SEARCH STUDENT BY NAME\n9.TO SEARCH STUDENT BY ID\n10.TO COMPARE DEPARTMENT OF TWO STUDENTS\n11.TO GET PERCENTAGE\n12.TO EXIT");
			System.out.println("Enter a number to choose one option");
			choice = input.nextInt();
			if (choice == 12) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println(studentOperations.addNewStudent());
				break;

			case 2:
				System.out.println(studentOperations.getFullName(studentOperations.getStudentId()));
				break;

			case 3:
				int age = studentOperations.getAge(studentOperations.getStudentId());
				if (age == -1) {
					System.out.println("not found");
				} else {
					System.out.println(age);
				}
				break;

			case 4:
				char gender = studentOperations.getGender(studentOperations.getStudentId());
				if (gender == 'o') {
					System.out.println("not found");
				} else {
					System.out.println(gender);
				}
				break;

			case 5:
				System.out.println(studentOperations.getTotalMarks(studentOperations.getStudentId()));
				break;

			case 6:
				float average = studentOperations.getTotalMarks(studentOperations.getStudentId());
				System.out.println(average / 3);
				break;

			case 7:
				Student student = studentOperations.getStudentDetails(studentOperations.getStudentId());
				if (student == null)
					System.out.println("not found");
				else
					System.out.println("StudentID : " + student.getStudentId() + "\nFirstName : "
							+ student.getFirstName() + "\nLastName : " + student.getLastName() + "\nAge : "
							+ student.getAge() + "\nGender : " + student.getGender() + "\nEnglish Marks : "
							+ student.getEnglishMarks() + "\nMaths Marks : " + student.getMathsMarks()
							+ "\nScience Marks : " + student.getScienceMarks() + "\nDepartment : "
							+ student.getDepartment());
				break;

			case 8:
				String firstName;
				System.out.println("enter first name to search ");
				firstName = input.next();
				System.out.println(studentOperations.searchByName(firstName));
				break;

			case 9:
				System.out.println(studentOperations.searchById(studentOperations.getStudentId()));
				break;

			case 10:
				int studentId1, studentId2;
				System.out.println("Enter id for student1 ");
				studentId1 = input.nextInt();
				System.out.println("Enter id for student2 ");
				studentId2 = input.nextInt();
				System.out.println(studentOperations.checkingDepartment(studentId1, studentId2));
				break;
				
			case 11:
				float percentage = studentOperations.getTotalMarks(studentOperations.getStudentId());
				System.out.println((percentage / 300)*100);
				break;
				
			default:
				System.out.println("please choose a valid option");
			}
		}
	}
}
