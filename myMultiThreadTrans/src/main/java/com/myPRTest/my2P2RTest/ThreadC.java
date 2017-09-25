package com.myPRTest.my2P2RTest;

public class ThreadC extends Thread {

	private C c;
	
	public ThreadC(C c) {
		this.c = c;
	}
	
	@Override
	public void run() {
		while(true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			c.getValue();
		}
	}

}
