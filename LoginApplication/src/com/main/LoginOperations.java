package com.main;

import java.util.Scanner;

import com.pojo.UserDetails;

public class LoginOperations {

	int choice;
	boolean flag = true;
	Scanner input = new Scanner(System.in);
	public void login(UserDetails user) {
		System.out.println("welcome "+user.getFirstName()+" "+user.getLastName());
		while(flag) {
			System.out.println("1.To view profile\n2.To logout");
			System.out.println("Enter your choice ");
			choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("first name : "+user.getFirstName());
				System.out.println("second name : "+user.getLastName());
				System.out.println("age : "+user.getAge());
				System.out.println("gender : "+user.getGender());
				System.out.println("contact number : "+user.getContactNumber());
				break;
			case 2:
				flag = false;
				break;
			default:
				System.out.println("please enter a valid option");
			}
		}
		
	}
}
