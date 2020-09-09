package com.main;

import java.util.Scanner;

import com.logic.ReversingNumberLogic;

public class ReversingNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userNumber;
		System.out.println("Enter a number ");
		userNumber = input.nextInt();
		System.out.println("Reversed Number is "+ReversingNumberLogic.getReversedNumber(userNumber));

	}

}
