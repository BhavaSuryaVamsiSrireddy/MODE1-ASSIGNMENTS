package com.service;

public class Number implements Runnable{
	
	private int number;
	
	public Number(int number) {
		super();
		this.number = number;
	}
	public void run() {
		System.out.println("before starting the thread which prints multiples of "+number);
		for(int i=1;i<=5;i++) {
			System.out.println(i*number);
		}
		System.out.println("after completing the thread which prints multiples of "+number);
	}

}
