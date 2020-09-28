package com.main;

import java.util.Scanner;

import com.dao.DetailsUpdate;
import com.dao.DetailsUpdateImplementation;
import com.dao.DisplayUserDetails;
import com.dao.DisplayUserDetailsImplementation;
import com.model.UserDetails;

public class Login {
	
	int choice;
	boolean flag = true;
	DetailsUpdate detailsUpdate = new DetailsUpdateImplementation();
	DisplayUserDetails details = new DisplayUserDetailsImplementation();
	Scanner input = new Scanner(System.in);
	public void login(UserDetails user) {
		System.out.println("welcome "+user.getFirstName()+" "+user.getLastName());
		while(flag) {
			System.out.println("1.To view profile\n2.To update firstname or lastname or gender\n3.To update age\n4.To logout");
			System.out.println("Enter your choice ");
			choice = input.nextInt();
			switch(choice) {
			//This  case is used to print the user details from database and it is processed in DisplayUserDetailsImplementation class which implements DisplayUserDetails Interface.
			case 1:
				UserDetails userDetailsFromDb = details.getUserDetails(user.getUserId());
				System.out.println("user Id : "+userDetailsFromDb.getUserId());
				System.out.println("first name : "+userDetailsFromDb.getFirstName());
				System.out.println("last name : "+userDetailsFromDb.getLastName());
				System.out.println("age : "+userDetailsFromDb.getAge());
				System.out.println("gender : "+userDetailsFromDb.getGender());
				break;
			//This case is  used to update firstname or lastname or gender and it is processed in DetailsUpdateImplementation class which implements DetailsUpdate Interface.
			case 2:
				String field;
				String updatedValue;
				System.out.println("Enter field to update ");
				field = input.next();
				System.out.println("Enter the value to update ");
				updatedValue = input.next();
				if(detailsUpdate.userDetailsUpdate(user.getUserId(), field, updatedValue)==1) {
					System.out.println("successfully updated");
				}
				else {
					System.out.println("failed to update");
				}
				break;
				//This case is  used to update age and it is processed in DetailsUpdateImplementation class which implements DetailsUpdate Interface.
			case 3:
				int age;
				System.out.println("Enter the age to update ");
				age = input.nextInt();
				if(detailsUpdate.updateAge(user.getUserId(), age)==1) {
					System.out.println("successfully updated");
				}
				else {
					System.out.println("failed to update");
				}
				break;
			//This case is to logout.so, that the control goes back to loginInput class from there it goes to main class. 
			case 4:
				flag = false;
				break;
			//This case is for printing message if user chooses an invalid choice.
			default:
				System.out.println("please enter a valid option");
			}
		}
		}
}
