package com.main;

import java.util.Scanner;

import com.logic.Pangram;

public class PangramMain {

	public static void main(String[] args) {
		
		String userString;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string ");
		userString = input.nextLine();
		if(Pangram.checkPangram(userString)) {
			System.out.println("pangram");
		}
		else {
			System.out.println("not a pangram");
		}
	}

}
