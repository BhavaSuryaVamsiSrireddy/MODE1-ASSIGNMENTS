package com.pojo;

public class Student {
	
	private int studentId;
	private String studentName;
	private int age;
	private String gender;
	
	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int age, String gender) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.gender = gender;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
