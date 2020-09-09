package com.main;

import java.util.Scanner;

import com.operation.TenLogic;

public class TenMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String sentance;
		System.out.println("Enter a sentance ");
		sentance = input.nextLine();
		System.out.println("The longest word in the sentence is "+TenLogic.getLargestWord(sentance));
	}

}
