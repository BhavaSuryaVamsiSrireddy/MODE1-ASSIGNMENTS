package com.main;

import java.util.Scanner;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		LoginInput loginInput = new LoginInput();
		Register register = new Register();
		boolean flag = true;
		int choice;
		while(flag) {
			System.out.println("1.To Register.\n2.To Login.\n3.To Exit");
			System.out.println("choose any option ");
			choice = input.nextInt();
			switch(choice) {
			case 1:
				//getting the input from user in Register class through registerInput() method.
				System.out.println(register.registerInput());
				break;
			case 2:
				//getting the input from user in LoginInput class through getLoginDetails() method.
				loginInput.getLoginDetails();
				break;
			case 3:
				//To get from the application.
				flag = false;
				break;
			default:
				System.out.println("please enter a valid option");
			
			}
		}
		
	}

}
