package com.main;

import java.util.Scanner;

import com.operation.NineLogic;

public class NineMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userNumber;
		System.out.println("Enter a number");
		userNumber = input.nextInt();
		System.out.println("The sum of even digits is "+NineLogic.sumOfSquaresOfEvenDigits(userNumber));
	}

}
