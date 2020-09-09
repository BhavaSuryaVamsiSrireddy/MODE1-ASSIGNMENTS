package com.main;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		LoginInput loginInput = new LoginInput();
		RegisterInput registerInput = new RegisterInput();
		boolean flag = true;
		int choice;
		while(flag) {
			System.out.println("1.To Register.\n2.To Login.\n3.To Exit");
			System.out.println("choose any option ");
			choice = input.nextInt();
			switch(choice) {
			case 1:
				registerInput.register();
				break;
			case 2:
				loginInput.login();
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("please enter a valid option");
			
			}
		}
		
	}

}
