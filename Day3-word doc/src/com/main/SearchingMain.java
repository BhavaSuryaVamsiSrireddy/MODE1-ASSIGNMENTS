package com.main;

import java.util.Scanner;

import com.logic.Searching;

public class SearchingMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sizeOfArray;
		System.out.println("Enter the size of the array ");
		sizeOfArray = input.nextInt();
		
		int[] numbers = new int[sizeOfArray];
		
		System.out.println("Enter the numbers in array ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println("Enter number to search ");
		int searchNumber = input.nextInt();
		if(Searching.search(numbers, searchNumber)) {
			System.out.println("number found");
		}
		else {
			System.out.println("number not found");
		}
	}

}
