package com.main;

import java.time.LocalTime;

import com.service.ThreadFirstProgram;

public class ThreadFirstMain {

	public static void main(String[] args) {
		
		ThreadFirstProgram t1 = new ThreadFirstProgram();
		t1.setName("MyThread");
		LocalTime time = LocalTime.now();
		System.out.printf("time before starting a thread %d(hours)-%d(minutes)-%d(seconds)",time.getHour(),time.getMinute(),time.getSecond());
		t1.start();
	
	}

}
