package com.main;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstNumber,secondNumber,thirdNumber;
		System.out.println("Enter the first number ");
		firstNumber = input.nextInt();
		System.out.println("Enter the second number ");
		secondNumber = input.nextInt();
		System.out.println("Enter the third number ");
		thirdNumber = input.nextInt();
		
		int result;
		//( firstNumber > secondNumber && firstNumber > thirdNumber) ? firstNumber : (secondNumber > thirdNumber) ? secondNumber : thirdNumber;
		if(( firstNumber > secondNumber && firstNumber > thirdNumber )) {
			result = firstNumber;
		}
		else if( secondNumber > thirdNumber ) {
			result = secondNumber;
		}
		else {
			result = thirdNumber;
		}
		System.out.println("The biggest number among three numbers is "+result);

	}

}
