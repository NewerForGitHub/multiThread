package com.mySynchroBlockthis;

public class Task {

	public void doLongTimeTask() {
		for(int i=0; i<100; i++) {
			System.out.println("nosychronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
		}
		System.out.println();
		synchronized (this) {
			for(int i=0; i<100; i++) {
				System.out.println("sychronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
			}
		}
	}
	
}
