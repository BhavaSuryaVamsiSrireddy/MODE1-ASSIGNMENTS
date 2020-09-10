package com.main;

import java.util.Scanner;

import com.logic.Addition;

public class AdditionMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int size;
		System.out.println("Enter the number of elements you want to enter ");
		size = input.nextInt();
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++) {
			//System.out.println("Enter a number ");
			numbers[i] = input.nextInt();
		}
		Addition.addition(numbers);
	}

}
