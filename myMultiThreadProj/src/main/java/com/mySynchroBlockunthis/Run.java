package com.mySynchroBlockunthis;

public class Run {

	public static void main(String[] args) {
		Task task = new Task();
//		MyThread1 thread1 = new MyThread1(task);
//		thread1.start();
//		MyThread1 thread2 = new MyThread1(task);
//		thread2.start();
		ThreadA a = new ThreadA(task);
		a.start();
		ThreadB b = new ThreadB(task); 
		b.start();
	}
	
}
