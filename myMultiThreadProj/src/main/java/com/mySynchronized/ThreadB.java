package com.mySynchronized;

public class ThreadB extends Thread {

//	private MyObject object;
//	
//	public ThreadB(MyObject object) {
//		this.object = object;
//	}
	
	@Override
	public void run() {
		MyObject.methodB();
	}

}
