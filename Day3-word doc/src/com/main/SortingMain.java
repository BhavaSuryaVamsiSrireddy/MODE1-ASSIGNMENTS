package com.main;

import java.util.Scanner;

import com.logic.Sorting;

public class SortingMain {

	public static void main(String[] args) {
		
		Sorting sorting = new Sorting();
		Scanner input = new Scanner(System.in);
		int sizeOfArray;
		System.out.println("Enter the size of the array ");
		sizeOfArray = input.nextInt();
		
		int[] numbers = new int[sizeOfArray];
		
		System.out.println("Enter the numbers to sort it in ascending order");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		int[] orderedNumbers = sorting.ascendingOrder(numbers);
		
		System.out.println("The sorted numbers are ");
		for (int i = 0; i < orderedNumbers.length; i++) {
			System.out.print(orderedNumbers[i]+" ");
		}

	}

}
