package com.main;

import com.service.DemoThread1;

public class DemoThread1Main {

	public static void main(String[] args) {
		
		DemoThread1 demoThread1 = new DemoThread1();
		Thread t1 = new Thread(demoThread1);
		DemoThread1 demoThread2 = new DemoThread1();
		Thread t2 = new Thread(demoThread2);
		DemoThread1 demoThread3 = new DemoThread1();
		Thread t3 = new Thread(demoThread3);
		t1.start();
		t2.start();
		t3.start();
	}

}
