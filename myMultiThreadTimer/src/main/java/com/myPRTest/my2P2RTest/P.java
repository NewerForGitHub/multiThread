package com.myPRTest.my2P2RTest;

public class P{

	private Object lock;
	
	public P(Object lock) {
		this.lock = lock;
	}
	
	public void setValue() {
		synchronized (lock) {
			while(!"".equals(ValueObject.value)) {
				try {
					System.out.println("������" + Thread.currentThread().getName() + " WAITING �ˡ�");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			String value = System.currentTimeMillis() + "_" + System.nanoTime();
			System.out.println("������" + Thread.currentThread().getName() + " Runnable��");
			ValueObject.value = value;
			lock.notifyAll();
			
		}
	}

}
