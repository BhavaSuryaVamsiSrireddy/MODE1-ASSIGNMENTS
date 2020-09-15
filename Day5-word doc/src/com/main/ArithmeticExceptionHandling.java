package com.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int firstNumber,secondNumber;
		try {
			System.out.println("Enter the first number ");
			firstNumber = input.nextInt();
			System.out.println("Enter the second number ");
			secondNumber = input.nextInt();
			System.out.println("Division of two numbers is "+(firstNumber/secondNumber));
		}
		catch(InputMismatchException exception) {
			System.out.println(exception);
		}
		catch(ArithmeticException exception) {
			System.out.println(exception);
		}

	}

}
