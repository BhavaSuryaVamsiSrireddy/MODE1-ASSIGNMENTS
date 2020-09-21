package com.main;

import com.service.DemoThread2;

public class DemoThread2Main {

	public static void main(String[] args) {
		
		DemoThread2 t1 = new DemoThread2();
		DemoThread2 t2 = new DemoThread2();
		DemoThread2 t3 = new DemoThread2();
		t1.start();
		t2.start();
		t3.start();

	}

}
