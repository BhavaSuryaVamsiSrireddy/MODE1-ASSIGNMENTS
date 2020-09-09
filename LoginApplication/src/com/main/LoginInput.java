package com.main;

import java.util.Scanner;
import com.services.LoginService;

import com.pojo.UserDetails;

public class LoginInput {

	Scanner input = new Scanner(System.in);
	LoginService loginService = new LoginService();
	LoginOperations loginOperations = new LoginOperations();
	String userName;
	String password;
	public void login() {
		System.out.println("Enter username : ");
		userName = input.next();
		System.out.println("Enter password : ");
		password = input.next();
		UserDetails user = loginService.validate(userName,password);
		if( user != null ) {
			loginOperations.login(user);
		}
		else {
			System.out.println("please enter valid credentials");
		}
	}
}
