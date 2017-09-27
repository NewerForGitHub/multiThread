package com.myPRTest.my2P2RTest;

public class C{

	private Object lock;
	
	public C(Object lock) {
		this.lock = lock;
	}
	
	public void getValue() {
		synchronized (lock) {
			while("".equals(ValueObject.value)) {
				try {
					System.out.println("������" + Thread.currentThread().getName() + " WAITING �ˡ�");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("������" + Thread.currentThread().getName() + " Runnable��");
			ValueObject.value = "";
			lock.notifyAll();
			
		}
	}

}
