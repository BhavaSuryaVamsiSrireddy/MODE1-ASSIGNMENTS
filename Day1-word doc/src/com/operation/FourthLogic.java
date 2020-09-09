package com.operation;

public class FourthLogic {

	private int firstNumber;
	private int secondNumber;
	
	public int getFirstNumber() {
		return firstNumber;
	}


	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}


	public int getSecondNumber() {
		return secondNumber;
	}


	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void swap() {
		int temp;
		temp = this.firstNumber;
		this.firstNumber = this.secondNumber;
		this.secondNumber = temp;
		
	}
}
