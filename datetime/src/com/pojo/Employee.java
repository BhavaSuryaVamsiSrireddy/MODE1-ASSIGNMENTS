package com.pojo;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDob;
	
	public Employee(int employeeId, String employeeName, String employeeDob) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDob = employeeDob;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDob() {
		return employeeDob;
	}
	public void setEmployeeDob(String employeeDob) {
		this.employeeDob = employeeDob;
	}
	
}
