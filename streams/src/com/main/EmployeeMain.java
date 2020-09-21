package com.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "gsrd", 10f));
		employees.add(new Employee(2, "surya", 3000f));
		employees.add(new Employee(3, "vamsi", 200f));
		employees.add(new Employee(4, "prasad", 500000f));
		employees.add(new Employee(5, "sirisha", 40000f));
		employees.add(new Employee(6, "vamsi", 2000f));
		employees.add(new Employee(7, "surya", 500f));
		
		//filter - to find employees salary greater than 10000.
		employees.stream().filter(employee -> employee.getEmployeeSalary() >10000f).forEach(employee->System.out.println(employee.getEmployeeName()));
		System.out.println();
		//map - increasing the salary of all employees by 1000.
		employees.stream().map(employee -> {employee.setEmployeeSalary(employee.getEmployeeSalary()+1000f);return employee;}).forEach(employee->System.out.println(employee.getEmployeeName()+"="+employee.getEmployeeSalary()));
		System.out.println();
		//distinct - to get employees with different names.
		employees.stream().map(employee->employee.getEmployeeName()).distinct().forEach(employee->System.out.println(employee));
		System.out.println();
		//sorted - to sort the employees based on salary.
		Comparator<Employee> comparator = (employee1,employee2) -> employee1.getEmployeeSalary()<employee2.getEmployeeSalary()?-1:employee1.getEmployeeSalary()>employee2.getEmployeeSalary()?1:employee1.getEmployeeName().compareTo(employee2.getEmployeeName());
		List<Employee> employeeDetails=employees.stream().sorted(comparator).collect(Collectors.toList());
		employeeDetails.forEach(employee->System.out.println(employee.getEmployeeName()+"="+employee.getEmployeeSalary()));
		System.out.println();
		//limit
		System.out.println("limit = ");
		employees.stream().limit(3).forEach(employee->System.out.println(employee.getEmployeeId()+"="+employee.getEmployeeName()));
		//skip
		System.out.println();
		System.out.println("skip = ");
		employees.stream().skip(3).forEach(employee->System.out.println(employee.getEmployeeId()+"="+employee.getEmployeeName()));
		System.out.println();
		//peek - peek without terminal operation it will give no output.
		employees.stream().peek(employee->System.out.println("before = "+employee.getEmployeeName())).map(employee -> employee.getEmployeeName().toUpperCase()).peek(employee->System.out.println("before = "+employee)).count();
		
	}

}
