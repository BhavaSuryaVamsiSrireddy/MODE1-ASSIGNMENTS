package com.main;

import java.util.Scanner;

import com.logic.PallindromeLogic;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userNumber;
		System.out.println("Enter a number ");
		userNumber = input.nextInt();
		if(PallindromeLogic.checkingPallindrome(userNumber)) {
			System.out.println("It is pallindrome");
		}else {
			System.out.println("Not a pallindrome");
		}
	}

}
