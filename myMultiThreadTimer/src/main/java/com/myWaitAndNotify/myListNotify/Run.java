package com.myWaitAndNotify.myListNotify;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		Remove r1 = new Remove(lock);
		r1.setName("R1");
		r1.start();
		Remove r2 = new Remove(lock);
		r2.setName("R2");
		r2.start();
		
		Thread.sleep(1000);
		Add add = new Add(lock);
		add.start();
	}
}
