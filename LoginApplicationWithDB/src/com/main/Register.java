package com.main;

import java.util.Scanner;

import com.dao.RegisterationImplementation;
import com.dao.Registration;
import com.model.UserDetails;

public class Register {
	String userId;
	String firstName;
	String lastName;
	String password;
	String gender;
	int age;
	Scanner input = new Scanner(System.in);
	UserDetails user = new UserDetails();
	Registration registration = new RegisterationImplementation();
	//getting the inputs from user and storing them in database through RegisterationImplementation class which implements Registeration Interface.
	public String registerInput() {
		System.out.println("Enter user id ");
		userId = input.next();
		System.out.println("Enter first Name ");
		firstName = input.next();
		System.out.println("Enter last Name ");
		lastName = input.next();
		while(true) {
			System.out.println("Enter password : ");
			password = input.next();
			if(password.length()>=8) {
				break;
			}
			System.out.println("please enter a password with minimum 8 characters");
		}
		System.out.println("Enter your gender ");
		gender = input.next();
		System.out.println("Enter your age ");
		age = input.nextInt();
		user.setAge(age);
		user.setFirstName(firstName);
		user.setGender(gender);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setUserId(userId);
		if(registration.register(user)) {
			return "successfully created your account";
		}
		else {
			return "sorry failed to create your account try again";
		}
	}

}
