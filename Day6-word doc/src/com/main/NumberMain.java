package com.main;

import com.service.Number;

public class NumberMain {

	public static void main(String[] args) {
		
		Number multiplesOfTwo = new Number(2);
		Thread threadOfMultilesOfTwo = new Thread(multiplesOfTwo);
		threadOfMultilesOfTwo.start();
		try {
			threadOfMultilesOfTwo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Number multiplesOfFive = new Number(5);
		Thread threadOfMultilesOfFive = new Thread(multiplesOfFive);
		threadOfMultilesOfFive.start();
		Number multiplesOfEight = new Number(8);
		Thread threadOfMultilesOfEight = new Thread(multiplesOfEight);
		threadOfMultilesOfEight.start();
	}

}
