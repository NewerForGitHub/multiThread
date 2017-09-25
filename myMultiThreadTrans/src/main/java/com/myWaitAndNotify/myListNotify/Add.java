package com.myWaitAndNotify.myListNotify;

public class Add extends Thread{

	private Object lock;
	
	public Add(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("��List������ַ���");
			ValueObject.list.add("�ҵθ���");
			System.out.println("��ӳɹ���notifyȫ���߳�");
			lock.notifyAll();
		}
	}
	
}
