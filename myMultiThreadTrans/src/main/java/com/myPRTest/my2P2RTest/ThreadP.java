package com.myPRTest.my2P2RTest;

public class ThreadP extends Thread {

	private P p;
	
	public ThreadP(P p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		while(true) {
			p.setValue();
		}
	}

}
