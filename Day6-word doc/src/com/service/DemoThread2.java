package com.service;

public class DemoThread2 extends Thread{
	
	public void run() {
		System.out.println("running child Thread in loop :");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException interruptedException) {
				System.out.println(interruptedException);
			}
		}
	}

}
