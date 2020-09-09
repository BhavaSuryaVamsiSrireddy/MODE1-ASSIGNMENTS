package com.main;

import java.util.Scanner;

import com.logic.RepeatedCharacters;

public class RepeatedMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		RepeatedCharacters repeatedCharacters = new RepeatedCharacters();
		boolean flag = true;

		while (flag) {
			System.out.println(
					"1.To get count of all characters in a string\n2.To get a count specified character in a string\n3.To exit");
			System.out.println("Enter your choice ");
			String userString;
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a string ");
				userString = input.next();
				System.out.println(repeatedCharacters.findingRepeatedChars(userString));
				break;
			case 2:
				System.out.println("Enter a string ");
				userString = input.next();
				System.out.println("Enter the character to get the count ");
				char character = input.next().charAt(0);
				System.out.println(repeatedCharacters.findingCharacter(userString, character));
				break;
			case 3:
				flag = false;
				break;
			default:
				System.out.println("please enter a valid choice");

			}
		}
	}

}
