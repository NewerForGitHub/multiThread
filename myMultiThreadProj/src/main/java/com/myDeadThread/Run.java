package com.myDeadThread;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		DeadThread t = new DeadThread();
		t.setFlag("a");
		Thread t1 = new Thread(t);
		t1.start();
		Thread.sleep(100);
		t.setFlag("b");
		Thread t2 = new Thread(t);
		t2.start();
	}

}
