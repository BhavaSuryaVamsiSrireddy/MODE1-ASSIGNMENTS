package com.pojo;

public class Student {
	private int studentId;
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private float englishMarks;
	private float mathsMarks;
	private float scienceMarks;
	private String department;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(float englishMarks) {
		this.englishMarks = englishMarks;
	}
	public float getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(float mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public float getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(float scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
