package com.myPRTest.myPRTest;

public class C{

	private Object lock;
	
	public C(Object lock) {
		this.lock = lock;
	}
	
	public void getValue() {
		synchronized (lock) {
			if("".equals(ValueObject.value)) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("getֵΪ��" + ValueObject.value);
			ValueObject.value = "";
			lock.notify();
			
		}
	}

}
