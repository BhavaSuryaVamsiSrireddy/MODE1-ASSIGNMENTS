package calculator_application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations calculate = new Operations();
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int number1,number2,choice;
		while(flag) {
			System.out.println("1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.TO EXIT");
			System.out.println("Enter a number to choose any one option");
			choice = input.nextInt();
			if(choice == 5) {
				break;
			}
			System.out.println("Enter the first number :");
			number1 = input.nextInt();
			System.out.println("Enter the second number :");
			number2 = input.nextInt();
			switch(choice) {
			case 1: System.out.println("The addition of two numbers is "+calculate.addition(number1,number2));
			break;
			case 2:System.out.println("The subtraction of two numbers is "+calculate.subtraction(number1,number2));
			break;
			case 3:System.out.println("The multiplication of two numbers is "+calculate.multiplication(number1,number2));
			break;
			case 4:System.out.println("The division of two numbers is "+calculate.division(number1,number2));
			break;
			default:System.out.println("please enter a valid number !!!");
			}
		}
	}

}
