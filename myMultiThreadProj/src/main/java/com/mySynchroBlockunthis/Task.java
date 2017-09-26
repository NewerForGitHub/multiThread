package com.mySynchroBlockunthis;

public class Task {

    private String anyString = new String();

    public void doLongTimeTask() {
//		for(int i=0; i<100; i++) {
//			System.out.println("nosychronized threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
//		}
//		System.out.println(); 
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("sychronized A threadName="
                    + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }

    public void doShortTimeTask() {
        synchronized (this.anyString) {
            for (int i = 0; i < 100; i++) {
                System.out.println("sychronized B threadName="
                    + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }

}
