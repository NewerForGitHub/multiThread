package com.myWaitAndNotify;

public class Test2 {

	public static void main(String[] args) {
		String lock = new String();
		System.out.println("syn����");
		synchronized (lock) {
			System.out.println("syn��һ��");
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("wait�µĴ���");
		}
		System.out.println("syn����");
	}
	
}
