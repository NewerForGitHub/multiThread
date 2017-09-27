package com.myWaitAndNotify.myNotify;

public class NotifyThread extends Thread{

	private Object lock;
	
	public NotifyThread(Object lock) {
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			lock.notify();
		}
	}

}
