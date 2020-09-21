package com.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.pojo.Employee;

public class EmployeeMain2 {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "gsrd", 10f));
		employees.add(new Employee(2, "surya", 3000f));
		employees.add(new Employee(3, "vamsi", 200f));
		employees.add(new Employee(4, "prasad", 500000f));
		employees.add(new Employee(5, "sirisha", 40000f));
		employees.add(new Employee(6, "vamsi", 2000f));
		employees.add(new Employee(7, "surya", 500f));
		//count
		boolean match;
		//allmatch - it will work like short circuit operator (&&)
		match = employees.stream().allMatch(employee->employee.getEmployeeSalary()==1000f);
		System.out.println("checking whether the all the employees has same salary 1000.rs "+match);
		System.out.println();
		//anymatch 
		match = employees.stream().anyMatch(employee->employee.getEmployeeSalary()==10f);
		System.out.println("checking whether any employee having 10.Rs salary "+match);
		System.out.println();
		//nonematch
		match = employees.stream().noneMatch(employee->employee.getEmployeeSalary()==100f);
		System.out.println("checking whether none of the employees has employees having salary 100.rs "+match);
		System.out.println();
		//count 
		long countOfEmployees = employees.stream().filter(employee->employee.getEmployeeSalary()>10000f).count();
		System.out.println("count of number of employees salary greater than 10000.Rs "+countOfEmployees);
		System.out.println();
		//collectors
		List<Employee> listOfEmployees = employees.stream().filter(employee->employee.getEmployeeName().equals("surya")).collect(Collectors.toList());
		listOfEmployees.forEach(employee->System.out.println(employee.getEmployeeId()+"="+employee.getEmployeeName()));
		System.out.println();
		//min 
		Comparator<Employee> comparator = (employee1,employee2) -> employee1.getEmployeeSalary()<employee2.getEmployeeSalary()?-1:employee1.getEmployeeSalary()>employee2.getEmployeeSalary()?1:employee1.getEmployeeName().compareTo(employee2.getEmployeeName());
		Employee maxSalaryEmployee = employees.stream().max(comparator).get();
		System.out.println(maxSalaryEmployee.getEmployeeName()+"="+maxSalaryEmployee.getEmployeeSalary());
		System.out.println();
		Employee minSalaryEmployee = employees.stream().min(comparator).get();
		System.out.println(minSalaryEmployee.getEmployeeName()+"="+minSalaryEmployee.getEmployeeSalary());
		System.out.println();
		//reduce
		List<String> employeeNames = new ArrayList<String>();
		employees.forEach(employee->employeeNames.add(employee.getEmployeeName()));
		Optional<String> employeeNameCombined = employeeNames.stream().reduce((employee1,employee2)->employee1+","+employee2);
		System.out.println(employeeNameCombined);
		
	}

}
