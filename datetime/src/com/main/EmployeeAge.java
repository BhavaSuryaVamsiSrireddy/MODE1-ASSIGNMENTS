package com.main;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Employee;
import com.service.AgeCalculator;

public class EmployeeAge {

	public static void main(String[] args) {
		AgeCalculator ageCalculator = new AgeCalculator();
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"gsrd","1990/09/03"));
		employees.add(new Employee(2,"surya","1998/09/03"));
		employees.add(new Employee(3,"vamsi","1995/08/03"));
		Scanner input = new Scanner(System.in);
		int employeeId;
		System.out.println("Enter employeeId to get the age of that employee ");
		employeeId = input.nextInt();
		for(Employee employee:employees) {
			if(employee.getEmployeeId()==employeeId) {
				Period age = ageCalculator.getAge(employee.getEmployeeDob());
				System.out.println("age is "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days.");
				break;
			}
		}
	}

}
