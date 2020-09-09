package com.main;

import java.util.Scanner;

import com.operation.EightLogic;

public class EightMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userNumber;
		System.out.println("Enter a number ");
		userNumber = input.nextInt();
		if(EightLogic.checkSum(userNumber) == 1) {
			System.out.println("Sum of odd digits is odd.");
		}
		else {
			System.out.println("Sum of odd digits is even.");
		}
	}

}
