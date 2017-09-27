package com.myWaitAndNotify.myEarlierNotify;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		
		MyRun myRun = new MyRun();
		Thread b = new Thread(myRun.runB);
		b.setName("B");
		b.start();
		Thread.sleep(1000);
		Thread a = new Thread(myRun.runA);
		a.setName("A");
		a.start();
	}
}
