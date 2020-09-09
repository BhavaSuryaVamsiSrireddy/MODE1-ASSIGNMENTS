package com.main;

import java.util.Scanner;

import com.operation.FiveLogic;

public class FiveMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int userNumber;
		System.out.println("Enter a number to check whether it is prime or not ");
		userNumber = input.nextInt();
		if(FiveLogic.checkPrime(userNumber)) {
			System.out.println(userNumber+" is a prime number");
		}
		else {
			System.out.println(userNumber+" is not a prime number");
		}
	}

}
