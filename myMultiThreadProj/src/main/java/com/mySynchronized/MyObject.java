package com.mySynchronized;

public class MyObject {

	synchronized public static void methodA() {
		System.out.println("Begin MethodA, Thread Name = " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End MethodA, Thread Name = " + Thread.currentThread().getName());
	}
	public static void methodB() {
		System.out.println("Begin MethodB, Thread Name = " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End MethodB, Thread Name = " + Thread.currentThread().getName());
	}
	
}
