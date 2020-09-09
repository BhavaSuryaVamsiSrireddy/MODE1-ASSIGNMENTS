package com.logic;

import com.pojo.Employee;

public class EmployeeOperations {
	
	public Employee[] salaryIncrement(Employee[] employees, float incrementAmount) {
		float newSalary;
		for(Employee employee:employees) {
			newSalary = employee.getSalary() + incrementAmount;
			employee.setSalary(newSalary);
		}
		return employees;
	}
	
	public Employee[] searchByName(Employee[] employees, String name) {
		Employee[] duplicates = new Employee[employees.length];
		int i = 0;
		for(Employee employee:employees) {
			if(employee.getEmployeeName().equals(name)) {
				duplicates[i] = employee;
				i++;
			}
		}
		return duplicates;
	}

}
