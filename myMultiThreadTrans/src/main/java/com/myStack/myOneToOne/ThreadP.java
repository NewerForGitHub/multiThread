package com.myStack.myOneToOne;

public class ThreadP extends Thread {

	private P p;
	
	public ThreadP(P p) {
		this.p = p;
	}
	
	@Override
	public void run() {
		while(true) {
			p.pushService();
		}
	}

}
