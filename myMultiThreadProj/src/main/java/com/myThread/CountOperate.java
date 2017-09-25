package com.myThread;

public class CountOperate extends Thread {
	
	public CountOperate() {
		System.out.println("CountOperate---Begin");
		System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
		System.out.println("this.getName():" + this.getName());
		System.out.println("CountOperate---End");
	}
	

	@Override
	public void run() {
		System.out.println("run---Begin");
		System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
		System.out.println("this.getName():" + this.getName());
		System.out.println("this.isAlive():" + this.isAlive());
		System.out.println("Thread.currentThread().isAlive():" + Thread.currentThread().isAlive());
		System.out.println("run---End");
	}

}
