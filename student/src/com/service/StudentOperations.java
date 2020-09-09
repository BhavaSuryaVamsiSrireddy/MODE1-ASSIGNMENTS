package com.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.pojo.Student;

public class StudentOperations {

	ArrayList<Student> students = new ArrayList<>();
	Scanner input = new Scanner(System.in);

	public int getStudentId() {
		System.out.println("enter student id ");
		return input.nextInt();
	}

	public String addNewStudent() {
		int studentId;
		String firstName;
		String lastName;
		int age;
		char gender;
		float englishMarks;
		float mathsMarks;
		float scienceMarks;
		String department;
		System.out.println("enter id ");
		studentId = input.nextInt();
		System.out.println("enter first name ");
		firstName = input.next();
		System.out.println("enter last name ");
		lastName = input.next();
		System.out.println("enter age ");
		age = input.nextInt();
		System.out.println("enter gender ");
		gender = input.next().charAt(0);
		System.out.println("enter english marks ");
		englishMarks = input.nextFloat();
		System.out.println("enter maths marks ");
		mathsMarks = input.nextFloat();
		System.out.println("enter science marks ");
		scienceMarks = input.nextFloat();
		System.out.println("enter department ");
		department = input.next();
		Student student = new Student();
		student.setAge(age);
		student.setDepartment(department);
		student.setEnglishMarks(englishMarks);
		student.setFirstName(firstName);
		student.setGender(gender);
		student.setLastName(lastName);
		student.setMathsMarks(mathsMarks);
		student.setScienceMarks(scienceMarks);
		student.setStudentId(studentId);
		students.add(student);
		return "successfully added";
	}

	public String getFullName(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student.getFirstName() + " " + student.getLastName();
			}
		}
		return "not found";
	}

	public int getAge(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student.getAge();
			}
		}
		return -1;
	}

	public char getGender(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student.getGender();
			}
		}
		return 'o';
	}

	public float getTotalMarks(int studentId) {
		float total = 0.0f;
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				total = student.getEnglishMarks() + student.getMathsMarks() + student.getScienceMarks();
			}
		}
		return total;
	}

	public Student getStudentDetails(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return student;
			}
		}
		return null;
	}

	public String searchByName(String firstName) {
		for (Student student : students) {
			if (student.getFirstName().equals(firstName)) {
				return "record found";
			}
		}
		return "record not found";
	}

	public String searchById(int studentId) {
		for (Student student : students) {
			if (student.getStudentId() == studentId) {
				return "record found";
			}
		}
		return "record not found";
	}

	public String checkingDepartment(int studentId1, int studentId2) {
		int flag = 0;
		String firstName1 = null, firstName2 = null, department1 = null, department2 = null;
		for (Student student1 : students) {
			if (student1.getStudentId() == studentId1) {
				firstName1 = student1.getFirstName();
				department1 = student1.getDepartment();
				for (Student student2 : students) {
					if (student2.getStudentId() == studentId2) {
						firstName2 = student2.getFirstName();
						department2 = student2.getDepartment();
						flag = 1;
						break;
					}
				}
				break;
			}
		}
		if (flag == 1) {
			if (department1.equals("cs") && department2.equals("cs")) {
				return firstName1 + " and " + firstName2;
			} else if (department1.equals("cs")) {
				return firstName1;
			} else if (department2.equals("cs")) {
				return firstName2;
			} else {
				return "none";
			}
		}
		return "record not found";
	}
}
