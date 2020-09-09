package com.main;

import java.util.Scanner;

public class TakingInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("enter a number ");
		number = input.nextInt();
		System.out.println("entered number is "+number);
		System.out.println("number after adding 100 is "+(number+100));

	}

}
