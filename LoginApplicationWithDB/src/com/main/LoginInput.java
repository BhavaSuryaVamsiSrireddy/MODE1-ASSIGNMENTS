package com.main;

import java.util.Scanner;

import com.dao.LoginValidationImplementation;
import com.dao.LoginValidation;
import com.model.UserDetails;

public class LoginInput {
	
	Scanner input = new Scanner(System.in);
	String userId;
	String password;
	
	public void getLoginDetails() {
		System.out.println("Enter your user id ");
		userId = input.next();
		System.out.println("Enter your password ");
		password = input.next();
		LoginValidation loginValidation = new LoginValidationImplementation();
		//validating the credentials in LoginValidationImplementation class which implements LoginValidation interface.
		UserDetails userDetails = loginValidation.validation(userId, password);
		Login userLogin = new Login();
		if(userDetails!=null) {
			//After validation if user is valid then control is goes to Login class where user can perform certain operations.
			userLogin.login(userDetails);
		}
		else {
			//if user is not valid means this message is printed.
			System.out.println("please enter valid credentials");
		}
	}

}
