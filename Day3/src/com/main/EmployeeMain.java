package com.main;

import java.util.Scanner;

import com.logic.EmployeeOperations;
import com.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeOperations employeeOperations = new EmployeeOperations();
		Employee[] employees = new Employee[5];
		employees[0]= new Employee(1, "surya", 1000);
		employees[1] = new Employee(2, "vamsi", 2000);
		employees[2] = new Employee(3, "surya", 3000);
		employees[3] = new Employee(1, "prasad", 4000);
		employees[4] = new Employee(1, "prasad", 5000);
		boolean flag = true;
		
		while(flag) {
			int choice;
			System.out.println("1.To increment\n2.To search by name\n3.To exit");
			choice = input.nextInt();
			if(choice == 1) {
				float incrementAmount;
				System.out.println("Enter to increase amount of employees ");
				incrementAmount = input.nextFloat();
				Employee[] updatedEmployees = employeeOperations.salaryIncrement(employees,incrementAmount);
				
				for (int i = 0; i < updatedEmployees.length; i++) {
					System.out.println("updated salary of "+updatedEmployees[i].getEmployeeName()+" is "+updatedEmployees[i].getSalary());
				}
			}
			else if (choice == 2) {
				String name;
				int count=0;
				System.out.println("Enter the name to search ");
				name = input.next();
				System.out.println("Employees are ");
				Employee[] duplicates = employeeOperations.searchByName(employees, name);
				for (int i = 0; i < duplicates.length; i++) {
					if(duplicates[i]!=null) {
						System.out.println("Id = "+duplicates[i].getEmployeeId()+" Name = "+duplicates[i].getEmployeeName());
						count = i+1;
					}
				}
				System.out.println("The number of employees with "+name+" are "+count);
			}
			else if (choice == 3){
				break;
			}
			else {
				System.out.println("please enter a valid choice");
			}

		}
		
	}

}
