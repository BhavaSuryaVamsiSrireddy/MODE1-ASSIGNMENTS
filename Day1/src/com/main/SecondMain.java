package com.main;

import java.util.Scanner;
import com.operation.SecondLogic;
public class SecondMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice;
		boolean flag = true;
		while(flag) {
			System.out.println("1.To Add\n2.To Subtract\n3.To Multiply\n4.To Division\n5.To exit");
			System.out.println("Enter your choice ");
			choice = input.nextInt();
			if(choice == 5) {
				break;
			}
			System.out.println("Enter first number ");
			int firstNumber = input.nextInt();
			System.out.println("Enter second number ");
			int secondNumber = input.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("ADDITION OF "+firstNumber+" and "+secondNumber+" is "+SecondLogic.addition(firstNumber, secondNumber));
				break;
			case 2:
				System.out.println("SUBTRACTION OF "+firstNumber+" and "+secondNumber+" is "+SecondLogic.subtraction(firstNumber, secondNumber));
				break;
			case 3:
				System.out.println("MULTIPLICATION OF "+firstNumber+" and "+secondNumber+" is "+SecondLogic.multiplication(firstNumber, secondNumber));
				break;
			case 4:
				System.out.println("DIVISION OF "+firstNumber+" and "+secondNumber+" is "+SecondLogic.division(firstNumber, secondNumber));
				break;
			default:
				System.out.println("please enter a valid choice");
			}
		}
		
	}

}
