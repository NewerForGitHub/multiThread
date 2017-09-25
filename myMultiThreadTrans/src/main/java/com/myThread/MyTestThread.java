package com.myThread;

public class MyTestThread implements Runnable{

	@Override
	public void run() {
		System.out.println("r1");
		System.out.println("r2");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new MyTestThread());
		t.start();
		System.out.println("m1");
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("m2");
		new StringBuffer().append("aa");
	}
}
