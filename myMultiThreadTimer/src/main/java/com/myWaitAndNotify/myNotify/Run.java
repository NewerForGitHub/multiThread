package com.myWaitAndNotify.myNotify;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();
		ThreadA a = new ThreadA(lock);
		a.setName("A");
//		ThreadB b = new ThreadB(lock);
//		b.setName("B");
//		ThreadC c = new ThreadC(lock);
//		c.setName("C");
		ThreadA b = new ThreadA(lock);
		b.setName("B");
		ThreadA c = new ThreadA(lock);
		c.setName("C");
		ThreadA d = new ThreadA(lock);
		d.setName("D");
		ThreadA e = new ThreadA(lock);
		e.setName("E");
		ThreadA f = new ThreadA(lock);
		f.setName("F");
		f.start();
		e.start();
		d.start();
		c.start();
		b.start();
		a.start();
		Thread.sleep(1000);
		NotifyThread notify1 = new NotifyThread(lock);
		notify1.start();
		Thread.sleep(1000);
		NotifyThread notify2 = new NotifyThread(lock);
		notify2.start();
		Thread.sleep(1000);
		NotifyThread notify3 = new NotifyThread(lock);
		notify3.start();
		Thread.sleep(1000);
		NotifyThread notify4 = new NotifyThread(lock);
		notify4.start();
		Thread.sleep(1000);
		NotifyThread notify5 = new NotifyThread(lock);
		notify5.start();
		Thread.sleep(1000);
		NotifyThread notify6 = new NotifyThread(lock);
		notify6.start();
//		Thread.sleep(5000);
//		System.exit(0);
	}
}
