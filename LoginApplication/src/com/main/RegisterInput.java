package com.main;

import java.util.Scanner;

import com.pojo.UserDetails;
import com.services.RegisterService;

public class RegisterInput {
	Scanner input = new Scanner(System.in);
	UserDetails newUser = new UserDetails();
	RegisterService registerService = new RegisterService();
	
	String userName;
	String password;
	String firstName;
	String lastName;
	String gender;
	int age;
	String contactNumber;
	
	
	public void register() {
		System.out.println("Enter username : ");
		userName = input.next();
		while(true) {
			System.out.println("Enter password : ");
			password = input.next();
			if(password.length()>=8) {
				break;
			}
			System.out.println("please enter a password with minimum 8 characters");
		}
		System.out.println("Enter first name : ");
		firstName = input.next();
		System.out.println("Enter last name : ");
		lastName = input.next();
		System.out.println("Enter your gender : ");
		gender = input.next();
		System.out.println("Enter your age : ");
		age = input.nextInt();
		System.out.println("Enter your contact number : ");
		contactNumber = input.next();
		newUser.setFirstName(firstName);
		newUser.setLastName(lastName);
		newUser.setPassword(password);
		newUser.setUserName(userName);
		newUser.setAge(age);
		newUser.setContactNumber(contactNumber);
		newUser.setGender(gender);
		if(registerService.registerNewUser(newUser)) {
			System.out.println("successfully created");
		}
	}
}
