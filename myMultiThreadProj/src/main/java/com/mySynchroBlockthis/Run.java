package com.mySynchroBlockthis;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();
		MyThread1 thread1 = new MyThread1(task);
		thread1.setName("A");
		MyThread1 thread2 = new MyThread1(task);
		thread2.setName("B");
		thread1.start();
		thread2.start();
	}
	
}
