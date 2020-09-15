package com.main;

import java.util.Scanner;

import com.logic.StringManipulation;

public class StringManipulationMain {

	public static void main(String[] args) {
		
		int choice;
		String userString;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.To get lowercase string\n2.To replace a character in a string\n3.To get substring in a string\n4.To check whether a string is palindrome or not\n5.To exit");
			System.out.println("Enter your choice ");
			choice = input.nextInt();
			if(choice == 5) {
				break;
			}
			System.out.println("Enter a string ");
			userString = input.next();
			switch(choice) {
			case 1:
				System.out.println(StringManipulation.lowerCase(userString));
				break;
			case 2:
				char targetCharacter,newCharacter;
				System.out.println("Enter the target character ");
				targetCharacter = input.next().charAt(0);
				System.out.println("Enter the new character to replace target character ");
				newCharacter = input.next().charAt(0);
				System.out.println(StringManipulation.replace(userString, targetCharacter, newCharacter));
				break;
			case 3:
				int startIndex,endIndex;
				System.out.println("Enter the starting index ");
				startIndex = input.nextInt();
				System.out.println("Enter the end index ");
				endIndex = input.nextInt();
				System.out.println(StringManipulation.subString(userString, startIndex, endIndex));
				break;
			case 4:
				if(StringManipulation.checkPalindrome(userString))
					System.out.println("YES");
				else
					System.out.println("NO");
				break;
			default:
				System.out.println("please enter a valid choice");
				
				
			}
		}
		

	}

}
