package com.main;

public class CommandLine {

	public static void main(String[] args) {
		
		System.out.println("args[0] = "+args[0]);
		Integer number  = new Integer(args[0]);
		System.out.println("number after adding 100 "+(number+100));
	}

}
