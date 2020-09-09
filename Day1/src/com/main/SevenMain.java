package com.main;

public class SevenMain {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i%3 == 0 && i%5 ==0 ) {
				System.out.println(i+" : fizz buzz");
				continue;
			}
			if(i%3 == 0) {
				System.out.println(i+" : fizz");
				continue;
			}
			if(i%5 == 0) {
				System.out.println(i+" : buzz");
				continue;
			}
		}

	}

}
