package com.myPRTest.myPRTest;

public class P{

	private Object lock;
	
	public P(Object lock) {
		this.lock = lock;
	}
	
	public void setValue() {
		synchronized (lock) {
			if(!"".equals(ValueObject.value)) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			String value = System.currentTimeMillis() + "_" + System.nanoTime();
			System.out.println("setֵΪ��" + value);
			ValueObject.value = value;
			lock.notify();
			
		}
	}

}
