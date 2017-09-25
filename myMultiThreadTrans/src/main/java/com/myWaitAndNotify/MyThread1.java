package com.myWaitAndNotify;

public class MyThread1 extends Thread {

	private Object lock;
	
	public MyThread1(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("��ʼ waittime=" + System.currentTimeMillis());
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���� waittime=" + System.currentTimeMillis());
			
		}
	}

}
