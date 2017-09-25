package com.mySynchronized;

public class Run {
	public static void main(String[] args) {
//		MyObject object = new MyObject();
		ThreadA a = new ThreadA();
		a.setName("A");
		ThreadB b = new ThreadB();
		b.setName("B");
		a.start();
		b.start();
	}
}
