package com.logic;

public class FirstLogic {
	
	public static int findingSmallestNumber(int firstNumber,int secondNumber,int thirdNumber) {
		
		if(firstNumber<secondNumber && firstNumber<thirdNumber) {
			return firstNumber;
		}
		else if(secondNumber<thirdNumber) {
			return secondNumber;
		}
		else {
			return thirdNumber;
		}
	}
}
