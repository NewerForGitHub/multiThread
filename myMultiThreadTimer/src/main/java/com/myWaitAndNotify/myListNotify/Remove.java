package com.myWaitAndNotify.myListNotify;

public class Remove extends Thread{

	private Object lock;
	
	public Remove(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			while(ValueObject.list.size() == 0) {
//			if(ValueObject.list.size() == 0) {
				System.out.println("list.size()=0," + Thread.currentThread().getName() + "�߳̽���ȴ�״̬");
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "�̵߳ȴ�����");
			}
			System.out.println("�Ƴ�list�ĵ�һ������");
			ValueObject.list.remove(0);
			System.out.println("�Ƴ���list.size()=" + ValueObject.list.size());
		}
	}
	
}
