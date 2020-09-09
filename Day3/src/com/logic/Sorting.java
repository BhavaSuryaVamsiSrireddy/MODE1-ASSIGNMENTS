package com.logic;

public class Sorting {

	public int[] ascendingOrder(int[] numbers) {
		
		int temp;
		
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if(numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		
		return numbers;
	}
	
}
